package board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.domain.NoticetbVO;
import board.pagination.Pagination;;

@Repository
public class NoticetbDaoMybatis implements NoticetbDao {

        private SqlSessionTemplate sqlSessionTemplate;

        public NoticetbDaoMybatis(SqlSessionTemplate sqlSessionTemplate){
        	 this.sqlSessionTemplate = sqlSessionTemplate;
        }
        
        public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
                this.sqlSessionTemplate = sqlSessionTemplate;
        }

        @Override
        public List<NoticetbVO> list(Pagination pagination) {
                return sqlSessionTemplate.selectList("noticetbDAO.list", pagination);
        }
        @Override
        public int delete(NoticetbVO NoticetbVO) {
                return sqlSessionTemplate.delete("noticetbDAO.delete", NoticetbVO);
        }
        @Override
        public int deleteAll() {
                return sqlSessionTemplate.delete("noticetbDAO.deleteAll");
        }
        @Override
        public int update(NoticetbVO NoticetbVO) {
                return sqlSessionTemplate.update("noticetbDAO.update", NoticetbVO);
        }
        @Override
        public void insert(NoticetbVO NoticetbVO) {
                sqlSessionTemplate.insert("noticetbDAO.insert", NoticetbVO);
        }
        @Override
        public NoticetbVO select(int noticeNo) {
        	NoticetbVO vo = (NoticetbVO) sqlSessionTemplate.selectOne("noticetbDAO.select", noticeNo);
                return vo;
        }
        @Override
        public int updateReadCount(int noticeNo) {
                return sqlSessionTemplate.update("noticetbDAO.updateCount", noticeNo);
        }

		@Override
		public int getListCnt() {
			return sqlSessionTemplate.selectOne("noticetbDAO.getListCnt");
		}

}
