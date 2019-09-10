package board.pagination;

import org.apache.ibatis.type.Alias;

@Alias("Search")
public class Search extends Pagination{

	private String searchType;
	private String keyword;	
		
	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}

