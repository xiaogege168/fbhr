package com.fubang.limao.controller;

import com.fubang.limao.domain.Hours;
import com.fubang.limao.mapper.HoursMapper;
import com.fubang.limao.mapper.WorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("hours")
public class HoursController {
    @Autowired
    WorkerMapper workerMapper;
    @Autowired
    HoursMapper hoursMapper;

    @RequestMapping("toAdd")
    public ModelAndView toAdd(Hours hours, HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv= new ModelAndView("hours/hoursAdd");
        return mv;
    }
    @RequestMapping("selectByWorker")
    public ModelAndView selectByWorker(String workerId,String month){
        ModelAndView mv= new ModelAndView("hours/hoursList");
        mv.getModel().put("hoursList",hoursMapper.selectByWorker(Integer.parseInt(workerId),month));
        mv.getModel().put("workerId", Integer.parseInt(workerId));
        mv.getModel().put("worker", workerMapper.selectByPrimaryKey(Integer.parseInt(workerId)));
        return mv;
    }
    @RequestMapping("selectByWorkerA")
    public ModelAndView selectByWorkerA(String workerId,String month){
        ModelAndView mv= new ModelAndView("hours/hoursList");
        mv.getModel().put("hoursList",hoursMapper.selectByWorker(Integer.parseInt(workerId),month));
        return mv;
    }

    @RequestMapping("add")
    public ModelAndView add(Hours hours,String workerId){
        ModelAndView mv= new ModelAndView("hoursList");
        hoursMapper.insert(hours);
        return selectByWorker(workerId,null);
    }
    @RequestMapping("toModify")
     public ModelAndView toModify(HttpServletRequest request,String hoursId){
        ModelAndView mv= new ModelAndView("hours/hoursModify");
        mv.getModel().put("hours",hoursMapper.selectByPrimaryKey(Integer.parseInt(hoursId)));
        return mv;
    }
    @RequestMapping("findA")
    public ModelAndView findA(HttpServletRequest request,String hoursId){
        ModelAndView mv= new ModelAndView("hours/hours");
        mv.getModel().put("hours",hoursMapper.selectByPrimaryKey(Integer.parseInt(hoursId)));
        return mv;
    }
    @RequestMapping("del")
    public ModelAndView del(String workerId,String hoursId){
            hoursMapper.deleteByPrimaryKey(Integer.parseInt(hoursId));
        return selectByWorker(workerId,null);
    }
    @RequestMapping("updateQingjia")
    public ModelAndView updateQingjia(Hours hours,String workerId){
        hoursMapper.updateQingjia(hours);
        return selectByWorker(workerId,null);
    }
    @RequestMapping("updateJiezi")
    public ModelAndView updateJiezi(Hours hours,HttpServletRequest request,String workerId){
        Hours hours1=hoursMapper.selectByWorkerToday(Integer.parseInt(workerId));
        if( hours1.getJiezi()==0 ){
            hours.setJieziSata("已申请");
            hoursMapper.updateJiezi(hours);
            return selectByWorker(workerId,null);
        }
        request.setAttribute("error","本周您已经申请过借支，不可重复提交 ！");
        return selectByWorker(workerId,null);
    }
    @RequestMapping("modify")
    public ModelAndView modify(Hours hours,String workerId){
        hoursMapper.updateByPrimaryKeySelective(hours);
        return selectByWorker(workerId,null);
    }
}
