package com.atclq.process.service;

import com.atclq.vo.process.ApprovalVo;
import com.atclq.vo.process.ProcessFormVo;
import com.atclq.vo.process.ProcessQueryVo;
import com.atclq.vo.process.ProcessVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atclq.model.process.Process;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * <p>
 * 审批类型 服务类
 * </p>
 *
 */
public interface OaProcessService extends IService<Process> {

    //审批管理列表
    IPage<ProcessVo> selectPage(Page<ProcessVo> pageParam, ProcessQueryVo processQueryVo);

    //部署流程定义
    void deployByZip(String deployPath);

    //启动流程
    void startUp(ProcessFormVo processFormVo);

    //查询待处理任务列表
    IPage<ProcessVo> findfindPending(Page<Process> pageParam);

    //查看审批详情信息
    Map<String, Object> show(Long id);

    //审批
    void approve(ApprovalVo approvalVo);

    //已处理
    IPage<ProcessVo> findProcessed(Page<Process> pageParam);

    //已发起
    IPage<ProcessVo> findStarted(Page<ProcessVo> pageParam);

}
