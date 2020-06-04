package kr.or.tg.board.model.vo;

public class Board {

	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private int readCount;
	private String wirteDate;
	private String fileName;
	private String filePath;
	private int boardType;

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, int readCount,
			String wirteDate, String fileName, String filePath, int boardType) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.readCount = readCount;
		this.wirteDate = wirteDate;
		this.fileName = fileName;
		this.filePath = filePath;
		this.boardType = boardType;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public String getWirteDate() {
		return wirteDate;
	}

	public void setWirteDate(String wirteDate) {
		this.wirteDate = wirteDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getBoardType() {
		return boardType;
	}

	public void setBoardType(int boardType) {
		this.boardType = boardType;
	}

}
