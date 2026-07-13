package com.example.rrmplatform;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rrmplatform.mapper.GoodMapper;
import com.example.rrmplatform.pojo.Good;
import com.example.rrmplatform.service.GoodService;
import com.example.rrmplatform.service.HeritageService;
import com.example.rrmplatform.service.LinkService;
import com.example.rrmplatform.service.impl.GoodServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RrmPlatformApplicationTests {
    @Autowired
    GoodService goodService;
    @Autowired
    HeritageService heritageService;
    @Autowired
    LinkService linkService;
    @Autowired
    GoodMapper goodMapper;
    @Test
    void goodTest() {
//        System.out.println(goodService.getGoodByGId(10));
//        System.out.println(goodService.addGood("test5", "this is test5", "the5"));
//        System.out.println(goodService.getAllGoods());
//        System.out.println(goodService.deleteGoodByGId(7));
//        System.out.println(goodService.getGoodByGName("test1"));
//        System.out.println(goodService.updateGood(4, "test4", "it is test4", "444"));
//        System.out.println(goodService.getAllGoods());
//        System.out.println(goodService.listGoodsByGAddress("四川"));
        List<Good> list = goodService.listGoodsByPageWithAddr(1, 8, "");
        list.forEach(System.out::println);
//        Page<Good> goodPage = goodService.getPage(1, 5);

    }

    @Test
    void heritageTest() {
//        System.out.println(heritageService.addHeritage("ykm", "long", "cd"));
//        System.out.println(heritageService.addHeritage("test", "long", "cd"));
//        System.out.println(heritageService.getAllHeritages());
//        System.out.println(heritageService.getHeritageByHId(1));
//        System.out.println(heritageService.deleteHeritage(4));
//        System.out.println(heritageService.getHeritageByHName("ykm"));
//        System.out.println(heritageService.updateHeritage(1, "scj", "soso", "cd"));
//        System.out.println(heritageService.getHeritageByHId(1));
        List<Good> list = goodService.listGoodsByGAddress("四川");
        list.forEach(System.out::println);
    }

    @Test
    void linkTest() {
        System.out.println(linkService.addLink(2, 4, "testshop", "nice shop", "jhalsd1234", 80));
        System.out.println(linkService.listLinks());
        System.out.println(linkService.updateLink(1, 1, "ykm's shop", "very nice", "123456", 100));
        System.out.println(linkService.deleteLink(1, 2));
        System.out.println(linkService.listLinks());
        System.out.println(linkService.getLinkByLId(1));
        System.out.println(linkService.getLinksByGName("test1"));
    }


}
