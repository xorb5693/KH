package api.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Servlet implementation class LolSearchServlet
 */
@WebServlet(name = "LolSearch", urlPatterns = { "/lolSearch" })
public class LolSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LolSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String key = "RGAPI-00e8624a-aa27-4040-8db1-b9b80865857b";
		String url1 = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + id;
		String result1 = Jsoup.connect(url1).data("api_key", key).userAgent("Mozilla").ignoreContentType(true).execute().body();
		System.out.println(result1);
		
		JsonObject userInfo1 = new JsonObject();
		JsonParser parser = new JsonParser();
		
		userInfo1 = (JsonObject)parser.parse(result1);
		String encId = userInfo1.get("id").toString().replace("\"", "");
		System.out.println(encId);
		
		String url2 = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/" + encId;
		String result2 = Jsoup.connect(url2).data("api_key", key).userAgent("Mozilla").ignoreContentType(true).execute().body();
		System.out.println(result2);

		JsonArray arr = (JsonArray)parser.parse(result2);
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		out.print(arr);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
