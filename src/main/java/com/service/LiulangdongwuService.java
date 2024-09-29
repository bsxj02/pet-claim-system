package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiulangdongwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiulangdongwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiulangdongwuView;


/**
 * 流浪动物
 *
 * @author 
 * @email 
 * @date 2024-02-29 15:35:33
 */
public interface LiulangdongwuService extends IService<LiulangdongwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiulangdongwuVO> selectListVO(Wrapper<LiulangdongwuEntity> wrapper);
   	
   	LiulangdongwuVO selectVO(@Param("ew") Wrapper<LiulangdongwuEntity> wrapper);
   	
   	List<LiulangdongwuView> selectListView(Wrapper<LiulangdongwuEntity> wrapper);
   	
   	LiulangdongwuView selectView(@Param("ew") Wrapper<LiulangdongwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiulangdongwuEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LiulangdongwuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LiulangdongwuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LiulangdongwuEntity> wrapper);



}

