package com.example.rrmplatform.controller;

import com.example.rrmplatform.common.Constants;
import com.example.rrmplatform.common.Result;
import com.example.rrmplatform.exception.ServiceException;
import com.example.rrmplatform.pojo.Heritage;
import com.example.rrmplatform.service.HeritageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/heritage")
public class HeritageController {
    @Autowired
    HeritageService heritageService;

    @PostMapping("/addHeritage")
    @ResponseBody
    public Result addHeritage(@RequestBody Map<String, String> heritage) {
        String name = heritage.get("name");
        String his = heritage.get("his");
        String addr = heritage.get("addr");
        try {
            heritageService.addHeritage(name, his, addr);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(Constants.CODE_400, "添加失败");
        }
        Heritage newHeritage = heritageService.getHeritageByHName(name);
        return Result.success(newHeritage);
    }

    @DeleteMapping("/deleteHeritage")
    @ResponseBody
    public Result deleteHeritage(@RequestParam("hId") int hId) {
        if (heritageService.deleteHeritage(hId) == 1) {
            return Result.success();
        } else {
            throw new ServiceException(Constants.CODE_400, "删除失败");
        }
    }

    @PostMapping("/updateHeritage")
    @ResponseBody
    public Result updateHeritage(@RequestBody Map<String, String> heritage) {
        int hId = Integer.parseInt(heritage.get("hId"));
        String name = heritage.get("name");
        String his = heritage.get("his");
        String addr = heritage.get("addr");
        try {
            heritageService.updateHeritage(hId, name, his, addr);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServiceException(Constants.CODE_400, "更新失败");
        }
        Heritage newHeritage = heritageService.getHeritageByHId(hId);
        return Result.success(newHeritage);
    }

    @GetMapping("/getAllHeritages")
    @ResponseBody
    public List<Heritage> getAllHeritages() {
        return heritageService.getAllHeritages();
    }

    @GetMapping("/getHeritageByHId")
    @ResponseBody
    public Heritage getHeritageByHId(@RequestParam("hId") int hId) {
        return heritageService.getHeritageByHId(hId);
    }

    @GetMapping("/getHeritageByHName")
    @ResponseBody
    public Heritage getHeritageByHName(@RequestParam("hName") String hName) {
        return heritageService.getHeritageByHName(hName);
    }

    @GetMapping("/listHeritagesByHAdress")
    @ResponseBody
    public List<Heritage> listHeritagesByHAddress(@RequestParam("hAddr") String hAddr) {
        return heritageService.listHeritagesByHAddress(hAddr);
    }
}
