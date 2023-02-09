package cn.ruoshy.jobmanagement.controller;

import cn.ruoshy.jobmanagement.entity.Company;
import cn.ruoshy.jobmanagement.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    public CompanyMapper companyMapper;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {

        return "";
    }
}
