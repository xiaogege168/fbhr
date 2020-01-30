package com.fubang.limao.controller;

import com.fubang.limao.domain.Factory;
import com.fubang.limao.domain.Worker;
import com.fubang.limao.mapper.DepartmentMapper;
import com.fubang.limao.mapper.FactoryMapper;
import com.fubang.limao.mapper.HoursMapper;
import com.fubang.limao.mapper.WorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

@Controller
@RequestMapping("worker")
public class WorkerController {
    @Autowired
    WorkerMapper workerMapper;

    @Autowired
    FactoryMapper factoryMapper;

    @Autowired
    HoursMapper hoursMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @RequestMapping("toLogin")
    public String  toLogin(Factory worker, HttpServletRequest request, HttpServletResponse response) {
            return "worker/login";
    }
    @RequestMapping("login")
    public ModelAndView login( HttpServletRequest request,String name,String password) {

        Worker real = workerMapper.login(name,password );
        if(real==null){
            return new ModelAndView("worker/login");
        }
        else {
            ModelAndView mv= new ModelAndView("hours/qingjia");
            mv.getModel().put("workerId",real.getIdworker());
            mv.getModel().put("name",real.getName());
            mv.getModel().put("hoursList",hoursMapper.selectByWorker(real.getIdworker(),null));

            String[] weekDays = {"周末", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
            Calendar calendar=Calendar.getInstance();
//            System.out.println("今天是"+weekDays[calendar.get(Calendar.DAY_OF_WEEK)-1]);
            request.setAttribute("weekDay",weekDays[calendar.get(Calendar.DAY_OF_WEEK)-1]);
            mv.getModel().put("weekDay",weekDays[calendar.get(Calendar.DAY_OF_WEEK)-1]);
            return mv;
        }
    }



    @RequestMapping("toAdd")
    public ModelAndView toAdd() {
        ModelAndView mv = new ModelAndView("worker/workerAdd");

        mv.getModel().put("factorys",factoryMapper.selectAll());
        return mv;
    }
    @RequestMapping("add")
    public ModelAndView add(Worker worker,String departmentId) {
        ModelAndView mv = new ModelAndView("workerList");
        workerMapper.insert(worker);
        return findAllAll();
    }

    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("worker/workerList");
        mv.getModel().put("workerList", workerMapper.selectAll());
        return mv;
    }
    @RequestMapping("findAllAll")
    public ModelAndView findAllAll() {
        ModelAndView mv = new ModelAndView("worker/workerList");
        mv.getModel().put("workerList", workerMapper.selectAllAll());
        return mv;
    }

    @RequestMapping("toModify")
    public ModelAndView toModify(HttpServletRequest request, String idworker) {
        ModelAndView mv = new ModelAndView("worker/workerModify");
        mv.getModel().put("factorys",factoryMapper.selectAll());
        mv.getModel().put("worker", workerMapper.selectByPrimaryKey(Integer.parseInt(idworker)));
        return mv;
    }

    @RequestMapping("modify")
    public ModelAndView modify(Worker worker) {
        workerMapper.updateByPrimaryKey(worker);
        return findAllAll();
    }


    @RequestMapping("findA")
    public ModelAndView findA(HttpServletRequest request, String workerId) {
        ModelAndView mv = new ModelAndView("worker/worker");
        mv.getModel().put("worker", workerMapper.selectByPrimaryKey(Integer.parseInt(workerId)));
        return mv;
    }

    @RequestMapping("del")
    public ModelAndView del(HttpServletRequest request, String workerId) {
        workerMapper.deleteByPrimaryKey(Integer.parseInt(workerId));
        return this.findAll();
    }


}
