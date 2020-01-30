package com.fubang.limao.controller;

import com.fubang.limao.domain.Department;
import com.fubang.limao.domain.Factory;
import com.fubang.limao.mapper.DepartmentMapper;
import com.fubang.limao.mapper.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("factory")
public class FactoryController {
    @Autowired
    FactoryMapper factoryMapper;
    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("toAdd")
    public ModelAndView toAdd(Factory factory,HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv= new ModelAndView("factory/factoryAdd");
        return mv;
    }
    @ResponseBody
    @RequestMapping("selectByFactory")
    public List<Department> selectByFactory(String factoryId){

        return departmentMapper.selectByFactory(Integer.parseInt(factoryId));
    }
    @RequestMapping("add")
    public ModelAndView add(Factory factory,HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv= new ModelAndView("factoryList");
        factoryMapper.insert(factory);
        return findAll();
    }
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView mv= new ModelAndView("factory/factoryList");
        mv.getModel().put("factoryList",factoryMapper.selectAll());
        return mv;
    }
    @RequestMapping("toModify")
    public ModelAndView toModify(HttpServletRequest request,String factoryId){
        ModelAndView mv= new ModelAndView("factory/factoryModify");
        mv.getModel().put("factory",factoryMapper.selectByPrimaryKey(Integer.parseInt(factoryId)));
        return mv;
    }
    @RequestMapping("findA")
    public ModelAndView findA(HttpServletRequest request,String factoryId){
        ModelAndView mv= new ModelAndView("factory/factory");
        mv.getModel().put("factory",factoryMapper.selectByPrimaryKey(Integer.parseInt(factoryId)));
        return mv;
    }
    @RequestMapping("del")
    public ModelAndView del(HttpServletRequest request,String factoryId){
            factoryMapper.deleteByPrimaryKey(Integer.parseInt(factoryId));
        return this.findAll();
    }
    @RequestMapping("modify")
    public ModelAndView modify(Factory factory){
        factoryMapper.updateByPrimaryKey(factory);
        return findAll();
    }
}
