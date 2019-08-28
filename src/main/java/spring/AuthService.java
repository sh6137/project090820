package spring;

public class AuthService {
	private MemberDao memberDao;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public AuthInfo authenticate(String memberid, String memberpass) {
		Member member =  memberDao.selectByMemberid(memberid);
		if(member ==null) {
			throw new IdPasswordMatchingException();
		}
		if(!member.matchPassword(memberpass)) {
			throw new IdPasswordMatchingException();
		}
		return new AuthInfo(member.getMemberid(), member.getMemberpass());
	}
}
