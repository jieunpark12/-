package org.study.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample2Mapper {
	@Insert("insert into study_tbl_sample2 (col2) values (#{data})")
	public int insertCol2(String data);
}
