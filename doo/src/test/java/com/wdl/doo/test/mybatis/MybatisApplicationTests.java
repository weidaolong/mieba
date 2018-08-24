package com.wdl.doo.test.mybatis;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wdl.doo.dao.PictureDao;
import com.wdl.doo.domain.model.PictureDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    @Resource
    private PictureDao pictureDao;
    @Test
    public void contextLoads() {
        Page<PictureDTO> page = PageHelper.startPage(1, 10).doSelectPage(new ISelect() {
            @Override
            public void doSelect() {
                pictureDao.selectAllPicture();
            }
        });
        log.info("page:{}",page);
    }

}
