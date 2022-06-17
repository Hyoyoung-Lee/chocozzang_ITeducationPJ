package com.mySpring.myapp.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.mySpring.myapp.member.vo.MemberVO;
import com.mySpring.myapp.member.vo.MemberVOTest;

import com.mySpring.myapp.member.vo.StudentVO;
import com.mySpring.myapp.member.vo.TakeBookVO;
import com.mySpring.myapp.member.vo.LectureVO;
import com.mySpring.myapp.board.vo.UserReviewVO;

public interface MemberService {
	 public List listMembers() throws DataAccessException;
	 
	 public List listMembersTest() throws DataAccessException;
	 
	 public int addMember(MemberVOTest memberVOTest) throws DataAccessException;
	 public int removeMember(String id) throws DataAccessException;
	 
	 public MemberVOTest selectMember(String id) throws DataAccessException;
	 
//	 public MemberVO login(MemberVO memberVO) throws Exception;
	 
	 public MemberVOTest loginTest(MemberVOTest memberVOTest) throws Exception;
	 
	 public void modMember(MemberVOTest memberVOTest) throws DataAccessException;
	 
	 // DDADA DB
	 public int addStudent(StudentVO studentVO) throws DataAccessException;
	 public StudentVO login(StudentVO studentVO) throws Exception;
	 public StudentVO selectStudent(String id) throws DataAccessException;
	 public void modStudent(StudentVO studentVO) throws DataAccessException;
	 public int removeStudent(String id) throws DataAccessException;
	  
	 // 태훈 파트
	 // 조회
	 public List<LectureVO> getList(); 
	       
	 //상세보기
	 public LectureVO detail(LectureVO lectureVO);
	       
	 //동영상보기
	 public LectureVO getvideo(LectureVO lectureVO);
	       
	 public List<LectureVO> detail2();
	       
	 public List<LectureVO> curlist();
	 
	 public int insertLecture(LectureVO lectureVO) throws DataAccessException;
	 public List<UserReviewVO> getReview();
	 
	 
	 // 효영 파트
	 public List listInstructor() throws Exception;
	 public List listStudent() throws DataAccessException;
	 
	//어드민 추가
	public void adminInsert(StudentVO studentVO) throws Exception;
		 
	 //어드민 수정
	 public void adminUpdate(StudentVO studentVO) throws Exception;
	 
	 //어드민
	 public StudentVO adminUpdateView(StudentVO studentVO);
	  
	 // 민상 파트
    public List<TakeBookVO> listTakeBook() throws Exception;
    public TakeBookVO selectTakeList(String BOOK_NUM);
    public TakeBookVO selectTake(String BOOK_NUM);
	    
}
