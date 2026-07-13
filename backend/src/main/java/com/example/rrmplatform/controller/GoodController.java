package com.example.rrmplatform.controller;

import com.example.rrmplatform.common.Constants;
import com.example.rrmplatform.common.Result;
import com.example.rrmplatform.exception.ServiceException;
import com.example.rrmplatform.pojo.Good;
import com.example.rrmplatform.pojo.Link;
import com.example.rrmplatform.service.GoodService;
import com.example.rrmplatform.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/good")
public class GoodController {
    @Autowired
    GoodService goodService;
    @Autowired
    LinkService linkService;

    @PostMapping("/addGood")
    @ResponseBody
    public Result addGood(@RequestBody Map<String, String> good) {
        String name = good.get("name");
        String dis = good.get("dis");
        String spec = good.get("spec");
        String addr = good.get("addr");
        try {
            goodService.addGood(name, dis, spec, addr);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(Constants.CODE_400, "添加失败");
        }
        Good newGood = goodService.getGoodByGName(name);
        return Result.success(newGood);
    }

    @DeleteMapping("/deleteGood")
    @ResponseBody
    public Result deleteGood(@RequestParam("gId") int gId) {
        if (goodService.deleteGoodByGId(gId) == 1) {
            return Result.success();
        } else {
            throw new ServiceException(Constants.CODE_400, "删除失败");
        }
    }

    @PostMapping("/updateGood")
    @ResponseBody
    public Result updateGood(@RequestBody Map<String, String> good) {
        int gId = Integer.parseInt(good.get("gId"));
        String name = good.get("name");
        String dis = good.get("dis");
        String spec = good.get("spec");
        String addr = good.get("addr");
        try {
            goodService.updateGood(gId, name, dis, spec, addr);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(Constants.CODE_400, "更新失败");
        }
        Good newGood = goodService.getGoodByGName(name);
        return Result.success(newGood);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Good> getAllGoods() {
        return goodService.getAllGoods();
    }

    @GetMapping("/getGoodByGId")
    @ResponseBody
    public Good getGoodByGId(@RequestParam("gId") int gId) {
        return goodService.getGoodByGId(gId);
    }

    @GetMapping("/getGoodByGName")
    @ResponseBody
    public Good getGoodByGName(@RequestParam("gName") String gName) {
        return goodService.getGoodByGName(gName);
    }

    @GetMapping("/listGoodsByGAddress")
    @ResponseBody
    public List<Good> listGoodsByGAddress(@RequestParam("gAddr") String gAddr) {
        return goodService.listGoodsByGAddress(gAddr);
    }


    @PostMapping("/addLink")
    @ResponseBody
    public Result addLink(@RequestBody Map<String, String> link) {
        Good good = goodService.getGoodByGName(link.get("gName"));
        int gId = good.getGId();
        int lId = Integer.parseInt(link.get("lId"));
        String name = link.get("lName");
        String info = link.get("lInfo");
        String link_url = link.get("link");
        int score = Integer.parseInt(link.get("lScore"));
        try {
            linkService.addLink(lId, gId, name, info, link_url, score);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(Constants.CODE_400, "添加链接失败");
        }
        Link newLink = linkService.getLinkByLId(lId);
        return Result.success(newLink);
    }

    @DeleteMapping("/deleteLink")
    @ResponseBody
    public Result deleteLink(@RequestParam("gId") int gId, @RequestParam("lId") int lId) {
        if (linkService.deleteLink(lId, gId) == 1) {
            return Result.success();
        } else {
            throw new ServiceException(Constants.CODE_400, "删除失败");
        }
    }

    @PostMapping("/updateLink")
    @ResponseBody
    public Result updateLink(@RequestBody Map<String, String> link) {
        int gId = Integer.parseInt(link.get("gId"));
        int lId = Integer.parseInt(link.get("lId"));
        String name = link.get("lName");
        String info = link.get("lInfo");
        String link_url = link.get("link");
        int score = Integer.parseInt(link.get("lScore"));
        try {
            linkService.updateLink(lId, gId, name, info, link_url, score);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(Constants.CODE_400, "更新失败");
        }
        Link newLink = linkService.getLinkByLId(lId);
        return Result.success(newLink);
    }

    @GetMapping("/getLinkByLId")
    @ResponseBody
    public Link getLinkByLId(@RequestParam("lId") int lId) {
        return linkService.getLinkByLId(lId);
    }

    @GetMapping("/getLinksByGName")
    @ResponseBody
    public List<Link> getLinksByGName(@RequestParam("GName") String gName) {
        return linkService.getLinksByGName(gName);
    }

    @GetMapping("/listLinks")
    @ResponseBody
    public List<Link> listLinksO() {
        return linkService.listLinks();
    }


}
