package board.domain;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Alias("Question_TbVO")
public class Question_TbVO {
        private int que_no;
        
        @Length(min=2, max=5, message="제목은 2자 이상, 5자 미만 입력해야 합니다.")
        private String que_title;
        
        @NotEmpty(message="내용을 입력하세요.")
        private String que_text;
        
        @NotEmpty(message="작성자를 입력하세요.")
        private String que_user;
        
        private String que_category;
        private int que_read_cnt;
        private Timestamp que_reg_dt;

        
        public Question_TbVO(){}
        
        public Question_TbVO(String que_title, String que_text, String que_user, String que_category){
                super();
                this.que_title = que_title;
                this.que_text = que_text;
                this.que_user = que_user;
                this.que_category = que_category;
                this.que_read_cnt = 0;
        }

        
		public int getQue_no() {
			return que_no;
		}

		public void setQue_no(int que_no) {
			this.que_no = que_no;
		}

		public String getQue_title() {
			return que_title;
		}

		public void setQue_title(String que_title) {
			this.que_title = que_title;
		}

		public String getQue_text() {
			return que_text;
		}

		public void setQue_text(String que_text) {
			this.que_text = que_text;
		}

		public String getQue_user() {
			return que_user;
		}

		public void setQue_user(String que_user) {
			this.que_user = que_user;
		}

		public String getQue_category() {
			return que_category;
		}

		public void setQue_category(String que_category) {
			this.que_category = que_category;
		}

		public int getQue_read_cnt() {
			return que_read_cnt;
		}

		public void setQue_read_cnt(int que_read_cnt) {
			this.que_read_cnt = que_read_cnt;
		}

		public Timestamp getQue_reg_dt() {
			return que_reg_dt;
		}

		public void setQue_reg_dt(Timestamp que_reg_dt) {
			this.que_reg_dt = que_reg_dt;
		}

        
        
}
