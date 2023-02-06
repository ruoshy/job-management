package cn.ruoshy.jobmanagement.mapper;

import cn.ruoshy.jobmanagement.entity.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {

    List<Company> queryAll();
}
