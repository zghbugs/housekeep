package com.connxun.app.repositories;

import com.connxun.app.entity.JzChannel;
import com.connxun.app.searchVO.JzChannelSearchVO;

import java.util.List;

/**
 * Created by anna on 2017-09-18.
 */
public interface JzChannelRepositoryCustom {

    List<JzChannel> getList(JzChannelSearchVO searchVO);
}
