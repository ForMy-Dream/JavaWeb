package jha.spring.springquicklystart.service.impl;

import jha.spring.springquicklystart.Mapper.LogMapper;
import jha.spring.springquicklystart.pojo.Logs;
import jha.spring.springquicklystart.service.LogServerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServerImpl implements LogServerInterface {
    @Autowired
    private LogMapper logMapper;
    @Override
    public Integer InsertLog(Logs log) {
        return logMapper.InsertLog(log);
    }
}
