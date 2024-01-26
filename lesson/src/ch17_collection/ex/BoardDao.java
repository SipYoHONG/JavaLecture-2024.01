package ch17_collection.ex;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	private List<Board> boardList = new ArrayList<>();

	public BoardDao() {
		boardList.add(new Board("자바 세계에 오신걸 환영합니다.", "제임스"));
		boardList.add(new Board("안녕하세요? 반갑습니다.", "마리아"));
		boardList.add(new Board("좋은 하루 되세요.", "브라이언"));
	}

	public List<Board> getBoardList() {
		List<Board> resultList = new ArrayList<>();
		for (Board board : boardList) {
			resultList.add(new Board(board.getTitle(), board.getContent()));
		}
		return resultList;
	}
}
