package cn.ruoshy.jobmanagement.mapper;

import cn.ruoshy.jobmanagement.entity.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {

    Company findById(Integer id);

    List<Company> findByName(String name);

    Integer insert(Company company);

    Integer update(Company company);
}
