<template>
    <div style="width: 100%; heigh: 100%;">

        <section class="mainbox">

            <div class="column">
                <div class="province font_fzqkbysjt">{{ name }}</div>
                <div class="province_info font_fzqkbysjt">{{ intro }}</div>

                <div class="map">
                    <div id="main" style="margin: -20px -90px; width: 820px; height: 550px;"></div>
                </div>

                <div class="map_explaination">地图来源：高德软件 GS京(2022)1061号</div>
            </div>

            <div class="column">
                <div class="no">
                    <div class="no-hd">
                        <ul>
                            <li class="li1 font_dsdigit">1132</li>
                            <li class="font_dsdigit">1062</li>
                        </ul>
                    </div>
                    <div class="no-bd">
                        <ul>
                            <li style="font-size: 13px;">省级非遗代表性项目(个)</li>
                            <li style="font-size: 13px;">省级非遗代表性传承人(人)</li>
                        </ul>
                    </div>
                    <div class="no_footer"></div>
                </div>

                <div class="panel bar2">
                    <h2>四川省各级非遗数量</h2>
                    <div class="chart" style="margin-top: -55px; height: 330px !important;">图表</div>
                    <div class="panel-footer"></div>
                </div>
                <div class="panel bar">
                    <h2>四川省各类非遗数量</h2>
                    <div class="chart">图表</div>
                    <div class="panel-footer"></div>
                </div>
            </div>



            <div class="column" style="margin-right: 20px;">
                <div class="no">
                    <div class="no-hd">
                        <ul>
                            <li class="li1 font_dsdigit">5357</li>
                            <li class="font_dsdigit">42.1</li>
                        </ul>
                    </div>
                    <div class="no-bd">
                        <ul>
                            <li style="font-size: 13px;">认定三品一标农产品(个)</li>
                            <li style="font-size: 13px;">2022农产品网络零售额(亿)</li>
                        </ul>
                    </div>
                    <div class="no_footer"></div>
                </div>

                <div class="panel bar3">
                    <h2>四川省农产品实时价格图</h2>
                    <div class="chart">图表</div>
                    <div class="panel-footer"></div>
                </div>
                <div class="panel pie">
                    <h2>四川省各价格区间农产品分布</h2>
                    <div class="chart">图表</div>
                    <div class="panel-footer"></div>
                </div>
            </div>

        </section>

        <div>
            <div class="province font_fzqkbysjt">特色画片</div>

            <div class="huapian_item font_fzqkbysjt">
                <img src="../../assets/huapian/四川1.png">

                <h2>四川省甘孜藏族自治州</h2>
                <p>
                    甘孜藏族自治州是一个以藏族为主体民族的地级行政区，俗称康巴地区或康区，是中国第二大藏区——康巴的主体和腹心地带。静卧青藏高原，绝美甘孜在沧海桑田的“世界脊梁”上用岁月的沧桑镌刻出了雄伟的山、柔美的水和叹为观止的风景。甘孜的特色产品有：康巴藏族服饰配饰制作，康巴服饰穿着佩饰自有讲究，具有浓郁的地域风情；甘孜青稞，甘孜青稞历史悠久，是甘孜州最古老的粮食作物之一。
                </p>

                <router-link :to="{ name: 'feiyiItem' }">
                    <div style="display: inline-block; position: absolute; margin-top: 160px; width: 340px;">
                        <P style="color: #000; margin-top: 30px;">特色非遗：康巴藏族服饰制作技艺</P>
                        <img src="../../assets/feiyi/康巴藏族服饰配饰制作技艺.png"
                            style="width: 320px; height: 180px; margin: 60px 20px; object-fit: cover;">
                    </div>
                </router-link>

                <router-link :to="{ name: 'nongItem' }">
                    <div
                        style="display: inline-block; position: absolute; margin-top: 160px; margin-left: 340px; width: 340px;">
                        <P style="color: #000; margin-top: 30px;">特色农产品：甘孜青稞</P>
                        <img src="../../assets/nong/甘孜青稞.png"
                            style="width: 320px; height: 180px; margin: 60px 20px; object-fit: cover;">
                    </div>
                </router-link>
            </div>

            <div class="huapian_item font_fzqkbysjt">
                <img src="../../assets/huapian/四川2.png">

                <h2>四川省资阳市安岳县</h2>
                <p>
                    安岳县，隶属四川省资阳市，位于四川盆地中部，成渝经济区腹心和成都、重庆的直线中点，被誉为“成渝之心”；安岳县北周建德四年置普州及安岳县，州、县同治一城，取“安居于山岳”而得名，安岳是全国唯一的柠檬基地生产县，柠檬种植面积达52万亩，产量占全国的80%，被称为“中国柠檬之都”。
                </p>

                <router-link :to="{ name: 'feiyiItem' }">
                    <div style="display: inline-block; position: absolute; margin-top: 160px; width: 340px;">
                        <P style="color: #000; margin-top: 30px;">特色非遗：安岳竹编</P>
                        <img src="../../assets/feiyi/安岳竹编.png"
                            style="width: 320px; height: 180px; margin: 60px 20px; object-fit: cover;">
                    </div>
                </router-link>

                <router-link :to="{ name: 'nongItem' }">
                    <div
                        style="display: inline-block; position: absolute; margin-top: 160px; margin-left: 340px; width: 340px;">
                        <P style="color: #000; margin-top: 30px;">特色农产品：安岳柠檬</P>
                        <img src="../../assets/nong/安岳柠檬.png"
                            style="width: 320px; height: 180px; margin: 60px 20px; object-fit: cover;">
                    </div>
                </router-link>
            </div>

        </div>
    </div>
</template>

<script>

import * as echarts from 'echarts'
import '../../js/flexible'
const sichuanJson = require("../../assets/sichuan.json");//获取中国地图的json数据
import "../../fonts/DS-DIGIT.css";

import request from "@/utils/request";
import "../../fonts/FZQKBYSJW.css";



export default {
    name: "huapianMain",
    data() {
        return {
            name: "四川省",
            intro: "四川省，简称“川”或“蜀”，是中华人民共和国省级行政区，省会成都，位于中国西南地区内陆，地处长江上游，素有“天府之国”的美誉。四川是中国道教发源地之一，古蜀文明发祥地，全世界最早的纸币“交子”出现地。四川盐业文化，酒文化源远流长；三国文化，红军文化，巴人文化精彩纷呈。",

        }
    },
    methods: {

    },

    mounted() {
        //柱状图-左侧
        (function () {
            var myChart = echarts.init(document.querySelector(".bar .chart"));
            var timer = null;
            myChart.clear();
            clearInterval(timer);
            var SData = [150, 110, 530, 50, 10, 580, 770, 110, 140, 30, 70];
            var option = {
                color: ["#34bca3"],
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow'
                    }
                },
                dataZoom: [
                    {
                        id: 'dataZoomX',
                        show: false,
                        type: 'slider',
                        xAxisIndex: [0],
                        filterMode: 'filter', // 设定为 'filter' 从而 X 的窗口变化会影响 Y 的范围。
                        startValue: 0,
                        endValue: 5
                    }
                ],
                grid: {
                    left: '0%',
                    top: "10px",
                    right: '0%',
                    bottom: '4%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
                        data: ['传统美术', '传统戏剧', '传统技艺', '传统体育', '传统手工技艺', '传统音乐', '民间文学', '传统曲艺', '传统舞蹈', '传统医药', '民俗'],
                        axisLabel: {
                            color: "#08544c",
                            fontSize: "10",
                            interval: 0
                        },
                        axisLine: {
                            show: false
                        },
                        axisTick: { show: false },
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        axisLabel: {
                            color: "#08544c",
                            fontSize: "10"
                        },
                        axisLine: {
                            lineStyle: {
                                color: "rgba(255,255,255,0.1",
                                width: 1,
                                type: "solid"
                            }
                        },
                        splitLine: {
                            show:true
                        }
                    },
                ],
                series: [
                    {
                        name: '数量',
                        type: 'bar',
                        barWidth: '35%',
                        data: SData,
                        itemStyle: {
                            barBorderRadius: 3
                        }
                    }
                ]
            };

            // 使用刚指定的配置项和数据显示图表。
            timer = setInterval(function () {
                // 每次向后滚动一个，最后一个从头开始。
                if (option.dataZoom[0].endValue == SData.length - 1) {
                    option.dataZoom[0].endValue = 5;
                    option.dataZoom[0].startValue = 0;
                }
                else {
                    option.dataZoom[0].endValue = option.dataZoom[0].endValue + 1;
                    option.dataZoom[0].startValue = option.dataZoom[0].startValue + 1;
                }
                myChart.setOption(option, true);
            }, 3000);



            myChart.clear();
            myChart.setOption(option, true);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //柱状图-右侧
        (function () {
            var myColor = ["#1089E7", "#F57474", "#56D0E3", "#F8B448", "#8B78F6"];
            var myChart = echarts.init(document.querySelector(".bar2 .chart"));
            var timer = null;
            myChart.clear();
            clearInterval(timer);
            var SData = [10, 193, 32, 11, 8];

            var option = {
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'none'
                    },
                    formatter: function (params) {
                        return params[0].name + ': ' + params[0].value;
                    }
                },
                dataZoom: [
                    {
                        id: 'dataZoomX',
                        show: false,
                        type: 'slider',
                        xAxisIndex: [0],
                        filterMode: 'filter', // 设定为 'filter' 从而 X 的窗口变化会影响 Y 的范围。
                        startValue: 0,
                        endValue: 4
                    }
                ],
                xAxis: {
                    data: ["区级", "县级", "市级", "省级", "国家级"],
                    axisTick: { show: false },
                    axisLine: { show: false },
                    axisLabel: {
                        color: '#08544c',
                        fontSize: 10
                    }
                },
                yAxis: {
                    splitLine: { show: true },
                    axisTick: { show: false },
                    axisLine: { show: false },
                    axisLabel: {
                        show: true,
                        color: '#08544c',
                        fontSize: 10
                    }
                },
                color: ['#34bca3'],
                series: [
                    {
                        name: 'hill',
                        type: 'pictorialBar',
                        barCategoryGap: '-130%',
                        // symbol: 'path://M0,10 L10,10 L5,0 L0,10 z',
                        symbol: 'path://M0,10 L10,10 C5.5,10 5.5,5 5,0 C4.5,5 4.5,10 0,10 z',
                        itemStyle: {
                            color: function (param) {
                                return myColor[param.dataIndex];
                            },
                            opacity: .5
                        },
                        emphasis: {
                            itemStyle: {
                                color: '#34bca3',
                                opacity: 1
                            }
                        },
                        data: SData
                    }
                ]
            };


            // 使用刚指定的配置项和数据显示图表。
            timer = setInterval(function () {
                // 每次向后滚动一个，最后一个从头开始。
                if (option.dataZoom[0].endValue == SData.length - 1) {
                    option.dataZoom[0].endValue = 4;
                    option.dataZoom[0].startValue = 0;
                }
                else {
                    option.dataZoom[0].endValue = option.dataZoom[0].endValue + 1;
                    option.dataZoom[0].startValue = option.dataZoom[0].startValue + 1;
                }
                myChart.setOption(option, true);
            }, 2000);



            myChart.clear();
            myChart.setOption(option, true);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //柱状图-左2
        (function () {
            var myChart = echarts.init(document.querySelector(".bar3 .chart"));
            var timer = null;
            myChart.clear();
            clearInterval(timer);

            var SData = [12.4, 13, 25, 260, 6, 15.4, 26, 32, 9.6, 6.6, 0.7, 1, 2.2, 1, 1.2, 1.8, 1.6, 1.6, 1.6, 5, 13, 25, 260, 6, 15.4, 26, 32, 9.6, 6.6, 0.7, 1, 2.2, 1, 1.2, 1.8, 1.6, 1.6, 1.6, 5, 1, 25, 260, 6, 15.4, 26, 32, 9.6, 6.6, 0.7, 1, 2.2, 1, 1.2, 1.8, 1.6, 1.6, 1.6, 5, 1, 1.6, 260, 6, 15.4, 26, 32, 9.6, 6.6, 0.7, 1, 2.2, 1, 1.2, 1.8, 1.6, 1.6, 1.6, 5, 1, 1.6, 2.4];

            var option = {
                color: ["#2f89cf"],
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow'
                    }
                },
                grid: {
                    top: '0',
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                dataZoom: [
                    {
                        id: 'dataZoomX',
                        show: false,
                        type: 'slider',
                        yAxisIndex: [0],
                        filterMode: 'filter', // 设定为 'filter' 从而 X 的窗口变化会影响 Y 的范围。
                        startValue: 0,
                        endValue: 5
                    }
                ],
                xAxis: {
                    type: 'value',
                    boundaryGap: [0, 0.01],
                    axisTick: {
                        alignWithLabel: true
                    },
                    axisLabel: {
                        color: "#08544c",
                        fontSize: "9",
                        interval: 0
                    },
                    axisLine: {
                        show: false
                    }
                },
                yAxis: {
                    type: 'category',
                    data: ['草鱼', '鲫鱼', '鲈鱼', '乌龟', '蛤蜊', '猪肉', '牛肉', '羊肉', '白条鸡', '鸡蛋', '大白菜', '西红柿', '樱桃西红柿', '黄瓜', '青椒', '油菜', '芹菜', '土豆', '白萝卜', '菠菜', '鲫鱼', '鲈鱼', '乌龟', '蛤蜊', '猪肉', '牛肉', '羊肉', '白条鸡', '鸡蛋', '大白菜', '西红柿', '樱桃西红柿', '黄瓜', '青椒', '油菜', '芹菜', '土豆', '白萝卜', '菠菜', '茄子', '鲈鱼', '乌龟', '蛤蜊', '猪肉', '牛肉', '羊肉', '白条鸡', '鸡蛋', '大白菜', '西红柿', '樱桃西红柿', '黄瓜', '青椒', '油菜', '芹菜', '土豆', '白萝卜', '菠菜', '茄子', '豆角', '乌龟', '蛤蜊', '猪肉', '牛肉', '羊肉', '白条鸡', '鸡蛋', '大白菜', '西红柿', '樱桃西红柿', '黄瓜', '青椒', '油菜', '芹菜', '土豆', '白萝卜', '菠菜', '茄子', '豆角', '胡萝卜'],
                    axisTick: {
                        show: false
                    },
                    axisLabel: {
                        color: "#08544c",
                        fontSize: "10"
                    },
                    axisLine: {
                        lineStyle: {
                            color: "rgba(0, 0, 0, .1)",
                            width: 1,
                            type: "solid"
                        }
                    },
                    splitLine: { show: false }
                },
                series: [
                    {
                        name: '价格',
                        type: 'bar',
                        data: SData,
                        itemStyle: {
                            barBorderRadius: 3
                        }
                    }
                ]
            };

            // 使用刚指定的配置项和数据显示图表。
            timer = setInterval(function () {
                // 每次向后滚动一个，最后一个从头开始。
                if (option.dataZoom[0].endValue == SData.length - 1) {
                    option.dataZoom[0].endValue = 5;
                    option.dataZoom[0].startValue = 0;
                }
                else {
                    option.dataZoom[0].endValue = option.dataZoom[0].endValue + 1;
                    option.dataZoom[0].startValue = option.dataZoom[0].startValue + 1;
                }
                myChart.setOption(option, true);
            }, 3000);



            myChart.clear();
            myChart.setOption(option, true);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //饼图
        (function () {
            var myChart = echarts.init(document.querySelector(".pie .chart"));
            var option = {
                color: [
                    "#065aab",
                    "#066eab",
                    "#0682ab",
                    "#0696ab",
                    "#06a0ab",
                ],
                tooltip: {
                    trigger: "item",
                    formatter: "{b}: {d}%"
                },
                legend: {
                    bottom: '5px',
                    itemHeight: 10,
                    itemWidth: 10,
                    data: ["1元以下", "1~5元", "5~10元", "10~15元", "15~20元", "20~30元", "30~50元", "50~100元", "100元以上"],
                    // 修改图例组件的文字为 12px
                    textStyle: {
                        color: "#08544c",
                        fontSize: 11
                    }
                },
                series: [
                    {
                        name: '',
                        type: 'pie',
                        center: ["50%", "43%"],
                        radius: ['0%', '70%'],
                        avoidLabelOverlap: false,
                        label: {
                            show: false,
                            position: 'center'
                        },
                        labelLine: {
                            show: true
                        },
                        itemStyle: {
                            borderRadius: 0
                        },
                        data: [
                            { value: 598, name: "1元以下" },
                            { value: 4791, name: "1~5元" },
                            { value: 2402, name: "5~10元" },
                            { value: 402, name: "10~15元" },
                            { value: 366, name: "15~20元" },
                            { value: 820, name: "20~30元" },
                            { value: 384, name: "30~50元" },
                            { value: 20, name: "50~100元" },
                            { value: 0, name: "100元以上" },
                        ],
                        emphasis: {
                            itemStyle: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };
            myChart.setOption(option);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //地图
        (function () {
            var chartDom = document.getElementById('main');
            var myChart = echarts.init(chartDom);
            echarts.registerMap("sichuan", sichuanJson);

            var option = {
                tooltip: {
                    //提示框
                    trigger: "item",
                    backgroundColor: "rgba(200, 229, 218, 0.4)",
                    borderWidth: 0,
                    show: true,
                    enterable: true,
                    formatter: function (params) {
                        console.log(params);

                        return `<div style="width:180px; height:max-content;">
                        <div style="display: inline-block; text-align:center; width:100%; color: #08544c; font-size: 10px">${params.name}</div>

                        
                        </div>
                        `;
                    },
                },
                series: [
                    {
                        type: "map",
                        map: "sichuan",
                        show: true,
                        roam: false,
                        label: {
                            normal: {
                                show: false,
                            },
                            emphasis: {
                                show: true,
                                fontSize: 14,
                                color: "#08544c",
                            },
                        },
                        itemStyle: {
                            normal: {
                                borderWidth: 0.7,
                                areaColor: "#C8E5DA",
                                borderColor: "#fff", // 线
                                // shadowColor: "#C8E5DA", // 外发光 
                                // shadowBlur: 20,
                            },
                            emphasis: {
                                // 也是选中样式
                                borderWidth: 2,
                                borderColor: "#fff",
                                areaColor: "#67e1ac", //悬浮区背景
                            },
                        },
                        animation: true,
                    }
                ],


            };
            myChart.setOption(option);
        })();

    }
}

</script>

<style scoped>
.font_fzqkbysjt {
    font-family: fzqkbysjt;
}

.province {
    font-size: 30px;
    color: #08544c;
    margin: 10px 40px;
    margin-top: 0;

}

.province_info {
    font-size: 18px;
    line-height: 1.5;
    color: #667;
    margin: 10px 40px;
}

.map {
    position: relative;
    width: 100%;
    height: 100%;
    margin: 0 auto;
}

/* .china_map {
    position: absolute;
    top: -50px;
    left: 0%;
    color: #aaedd0;
} */

.map_explaination {
    position: absolute;
    bottom: 20px;
    left: 40px;
    font-size: 14px;
    color: #667;
}


* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

li {
    list-style: none;
}

.font_dsdigit {
    font-family: dsdigit;
}

.mainbox {
    display: flex;
    min-width: 1024px;
    max-width: 1920px;
    margin: 70px auto;
    padding: 0.125rem 0.125rem 0;
}

.mainbox .column {
    flex: 5;
}

.mainbox .column:nth-child(2) {
    flex: 5;
    margin: 0 0.125rem 0.1875rem;
    overflow: hidden;
}

.mainbox .panel {
    position: relative;
    height: 4.6rem;
    padding: 2px;
    margin: 0 10px 20px 10px;
    border: 1px solid rgba(25, 186, 139, 0.17);
}

.mainbox .panel::before {
    position: absolute;
    top: 0;
    left: 0;
    width: 10px;
    height: 10px;
    border-left: 2px solid #02a6b5;
    border-top: 2px solid #02a6b5;
    content: "";
}

.mainbox .panel::after {
    position: absolute;
    top: 0;
    right: 0;
    width: 10px;
    height: 10px;
    border-right: 2px solid #02a6b5;
    border-top: 2px solid #02a6b5;
    content: "";
}

.mainbox .panel-footer {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
}

.mainbox .panel-footer::before {
    position: absolute;
    left: 0;
    bottom: 0;
    width: 10px;
    height: 10px;
    border-left: 2px solid #02a6b5;
    border-bottom: 2px solid #02a6b5;
    content: "";
}

.mainbox .panel-footer::after {
    position: absolute;
    right: 0;
    bottom: 0;
    width: 10px;
    height: 10px;
    border-right: 2px solid #02a6b5;
    border-bottom: 2px solid #02a6b5;
    content: "";
}

.mainbox h2 {
    height: 0.6rem;
    color: #08544c;
    line-height: 0.6rem;
    text-align: center;
    font-size: 0.25rem;
    font-weight: 400;
}

.mainbox h2 a {
    color: #08544c;
    text-decoration: none;
    margin: 0 0.125rem;
}

.mainbox .chart {
    height: 3.8rem;
}

.mainbox .no {
    position: relative;
    background: rgba(200, 229, 218, .3);
    padding: 0.1875rem;
    margin: 20px 10px;
    margin-top: 0;
}

.mainbox .no .no-hd {
    position: relative;
    border: 1px solid rgba(25, 186, 139, 0.17);
}

.mainbox .no .no-hd ul {
    display: flex;
}

.mainbox .no .no-hd ul li {
    flex: 1;
    line-height: 1rem;
    font-size: 0.875rem;
    color: #00ca98;
    text-align: center;
}

.mainbox .no .no-hd ul .li1 {
    position: relative;
}

.mainbox .no .no-hd ul .li1::after {
    content: "";
    position: absolute;
    top: 20%;
    right: 0;
    height: 60%;
    width: 1px;
    background-color: rgba(25, 186, 139, 0.17);
}

.mainbox .no .no_footer {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
}

.mainbox .no::before {
    position: absolute;
    top: 0;
    left: 0;
    width: 30px;
    height: 10px;
    border-top: 2px solid #02a6b5;
    border-left: 2px solid #02a6b5;
    content: "";
}

.mainbox .no .no_footer::after {
    position: absolute;
    bottom: 0;
    right: 0;
    width: 30px;
    height: 10px;
    border-bottom: 2px solid #02a6b5;
    border-right: 2px solid #02a6b5;
    content: "";
}

.mainbox .no .no-bd {
    padding-top: 0.15rem;
}

.mainbox .no .no-bd ul {
    display: flex;
}

.mainbox .no .no-bd ul li {
    flex: 1;
    height: 0.5rem;
    line-height: 0.5rem;
    font-size: 0.275rem;
    color: #7fac9b;
    text-align: center;
}

.mainbox .map {
    position: relative;
    height: 10.125rem;
}

.huapian_item {
    margin: 20px auto;
    margin-bottom: 60px;
    width: 1360px;
    height: max-content;
}

.huapian_item img {
    border-radius: 5px;
    width: 700px;
    height: auto;
}

.huapian_item h2 {
    position: absolute;
    display: inline-block;
    font-size: 24px;
    margin: 0 20px;
}

.huapian_item p {
    position: absolute;
    display: inline-block;
    font-size: 18px;
    margin: 30px 20px;
    line-height: 1.5;
    color: #667;
}

.huapian_item .el-row {
    margin-bottom: 20px;
}

.huapian_item .el-row:last-child {
    margin-bottom: 0;
}

.huapian_item .el-col {
    border-radius: 4px;
}

.huapian_item .bg-purple {
    background: #d3dce6;
}

.huapian_item .grid-content {
    border-radius: 4px;
    min-height: 36px;
}

/* 约束屏幕尺寸 */
@media screen and (max-width: 1024px) {
    html {
        font-size: 42px !important;
    }
}

@media screen and (min-width: 1920px) {
    html {
        font-size: 80px !important;
    }
}
</style>