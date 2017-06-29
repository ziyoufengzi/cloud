package com.jfsoft.peis.service.impl;

import com.jfsoft.peis.mapper.TcPerCheckinfoMapper;
import com.jfsoft.peis.service.IPeisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by web on 2017/6/28.
 */
@Service
public class PeisServiceImpl implements IPeisService {

    @Autowired
    private TcPerCheckinfoMapper tcPerCheckinfoMapper;

    public String insertPeisPercheckinfo() throws Exception {

        return "";
    }

}
