<template>
    <div style="width: 100%; heigh: 100%;">
        <img class="bg-img-neimenggu" src="../../assets/huapian/内蒙古2.png" alt="图片加载失败">
        <img class="bg-img-xinjiang" src="../../assets/huapian/新疆.png" alt="图片加载失败">
        <img class="bg-img-qinghai" src="../../assets/huapian/青海.png" alt="图片加载失败">
        <img class="bg-img-sichuan" src="../../assets/huapian/四川1.png" alt="图片加载失败">

        <section class="mainbox">

            <div class="column">
                <div class="panel line">
                    <h2 style="font-size: 12px; height: 10px;">中国入选联合国教科文组织非物质文化遗产名录（名册）项目数</h2>
                    <div class="chart" style="height: 210px;">图表</div>
                    <div class="panel-footer"></div>
                </div>
                <div class="panel bar3">
                    <h2>全国各省注册商标农产品数量</h2>
                    <div class="chart">图表</div>
                    <div class="panel-footer"></div>
                </div>
                <div class="panel">
                    <h2>乡村画片</h2>
                    <img style="width: 150px; height: 90px; margin: 0px 5px 3px 13px;" src="../../assets/huapian/内蒙古2.png">
                    <img style="width: 150px; height: 90px; margin: 0px 5px 3px 5px;" src="../../assets/huapian/贵州2.png">
                    <img style="width: 150px; height: 90px; margin: 0px 5px 5px 13px;" src="../../assets/huapian/苏州.png">
                    <img style="width: 150px; height: 90px; margin: 0px 5px 5px 5px;" src="../../assets/huapian/新疆.png">
                    
                    <div class="panel-footer"></div>
                </div>
            </div>

            <div class="column">
                <div class="no">
                    <div class="no-hd">
                        <ul>
                            <li class="li1 font_dsdigit">437</li>
                            <li class="font_dsdigit">872</li>
                        </ul>
                    </div>
                    <div class="no-bd">
                        <ul>
                            <li>已参与乡村数</li>
                            <li>共生成画片数</li>
                        </ul>
                    </div>
                    <div class="no_footer"></div>
                </div>

                <div class="map">
                    <div id="main" style="margin: -90px -90px; width: 890px; height: 1000px;"></div>
                </div>
                <div class="map_explaination">地图来源：高德软件 GS京(2022)1061号</div>
            </div>

            <div class="column">
                <div class="panel bar">
                    <h2>国家级非物质文化遗产代表性项目各省份子项数量</h2>
                    <div class="chart">图表</div>
                    <div class="panel-footer"></div>
                </div>
                <div class="panel line2">
                    <h2>2013~2020年“全国名特优新农产品”名录</h2>
                    <div class="chart">图表</div>
                    <div class="panel-footer"></div>
                </div>
                <div class="panel pie2">
                    <h2>已生成的各省画片数量</h2>
                    <div class="chart">图表</div>
                    <div class="panel-footer"></div>
                </div>
            </div>

        </section>
    </div>
</template>

<script>

import request from "@/utils/request";

import * as echarts from 'echarts'
import '../../js/flexible'
const chinaJson = require("../../assets/china_map.json");//获取中国地图的json数据
import "../../fonts/DS-DIGIT.css";

import feiyiCommercial from '../../assets/feiyi_commercial.json'

export default {
    name: "huapianMain",
    data() {
        return {

        }
    },
    methods: {

    },

    mounted() {
        //柱状图-右1
        (function () {
            var myChart = echarts.init(document.querySelector(".bar .chart"));
            var timer = null;
            myChart.clear();
            clearInterval(timer);
            var SData = [165, 120, 145, 257, 76, 145, 137, 90, 44, 47, 53, 162, 125, 99, 70, 153, 159, 180, 76, 55, 42, 161, 186, 145, 91, 83, 88, 106, 28, 140, 7, 105, 12, 11, 0];
            var option = {
                color: ["#2f89cf"],
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
                        data: ['广东', '北京', '福建', '浙江', '上海', '湖北', '湖南', '江西', '海南', '天津', '重庆', '河北', '河南', '安徽', '广西壮族自治区', '四川', '贵州', '山西', '辽宁', '吉林', '黑龙江', '江苏', '山东', '云南', '陕西', '甘肃', '青海', '内蒙古自治区', '宁夏回族自治区', '新疆维吾尔自治区', '新疆生产建设兵团', '西藏自治区', '香港', '澳门', '台湾'],
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
                                color: "rgba(255,255,255,0.5)",
                                width: 1,
                                type: "solid"
                            }
                        },
                        splitLine: {
                            lineStyle: {
                                color: "rgba(255,255,255,0.15)"
                            }
                        }
                    },
                ],
                series: [
                    {
                        name: '项目数量',
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
            }, 2500);



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

            var SData = [266, 46, 675, 424, 40, 709, 374, 249, 121, 49, 338, 361, 330, 347, 291, 826, 374, 265,
                278, 142, 306, 470, 1191, 368, 299, 281, 126, 321, 86, 219, 168];

            var option = {
                color: ["#34bca3"],
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
                    data: ['广东', '北京', '福建', '浙江', '上海', '湖北', '湖南', '江西', '海南',
                        '天津', '重庆', '河北', '河南', '安徽', '广西壮族自治区', '四川', '贵州', '山西',
                        '辽宁', '吉林', '黑龙江', '江苏', '山东', '云南', '陕西', '甘肃', '青海',
                        '内蒙古自治区', '宁夏回族自治区', '新疆维吾尔自治区', '西藏自治区'],
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
                        name: '注册商标农产品数',
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
            }, 2500);



            myChart.clear();
            myChart.setOption(option, true);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //柱状图-右侧
        // (function () {
        //     var jsonData = feiyiCommercial.dots;
        //     var data_name = new Array();
        //     var data_item_count = new Array();

        //     for (let i = 0; i < jsonData.length; i++) {
        //         data_name.push(jsonData[i].name);
        //         data_item_count.push(parseInt(jsonData[i].item_count));
        //     }
        //     var myChart = echarts.init(document.querySelector(".bar2 .chart"));
        //     var timer = null;
        //     myChart.clear();
        //     clearInterval(timer);

        //     var SData = data_item_count;

        //     var option = {
        //         color: ["#34bca3"],
        //         tooltip: {
        //             trigger: 'axis',
        //             axisPointer: {
        //                 type: 'shadow'
        //             }
        //         },
        //         grid: {
        //             top: '0',
        //             left: '3%',
        //             right: '4%',
        //             bottom: '3%',
        //             containLabel: true
        //         },
        //         dataZoom: [
        //             {
        //                 id: 'dataZoomX',
        //                 show: false,
        //                 type: 'slider',
        //                 yAxisIndex: [0],
        //                 filterMode: 'filter', // 设定为 'filter' 从而 X 的窗口变化会影响 Y 的范围。
        //                 startValue: 0,
        //                 endValue: 5
        //             }
        //         ],
        //         xAxis: {
        //             type: 'value',
        //             boundaryGap: [0, 0.01],
        //             axisTick: {
        //                 alignWithLabel: true
        //             },
        //             axisLabel: {
        //                 color: "#08544c",
        //                 fontSize: "9",
        //                 interval: 0
        //             },
        //             axisLine: {
        //                 show: false
        //             }
        //         },
        //         yAxis: {
        //             type: 'category',
        //             data: data_name,
        //             axisTick: {
        //                 show: false
        //             },
        //             axisLabel: {
        //                 color: "#08544c",
        //                 fontSize: "10"
        //             },
        //             axisLine: {
        //                 lineStyle: {
        //                     color: "rgba(0, 0, 0, .1)",
        //                     width: 1,
        //                     type: "solid"
        //                 }
        //             },
        //             splitLine: { show: false }
        //         },
        //         series: [
        //             {
        //                 name: '非遗数量',
        //                 type: 'bar',
        //                 data: SData,
        //                 itemStyle: {
        //                     barBorderRadius: 3
        //                 }
        //             }
        //         ]
        //     };

        //     // 使用刚指定的配置项和数据显示图表。
        //     timer = setInterval(function () {
        //         // 每次向后滚动一个，最后一个从头开始。
        //         if (option.dataZoom[0].endValue == SData.length - 1) {
        //             option.dataZoom[0].endValue = 4;
        //             option.dataZoom[0].startValue = 0;
        //         }
        //         else {
        //             option.dataZoom[0].endValue = option.dataZoom[0].endValue + 1;
        //             option.dataZoom[0].startValue = option.dataZoom[0].startValue + 1;
        //         }
        //         myChart.setOption(option, true);
        //     }, 2000);



        //     myChart.clear();
        //     myChart.setOption(option, true);
        //     window.addEventListener('resize', function () {
        //         myChart.resize();
        //     });
        // })();

        //折线图-左1
        (function () {
            var timer = null;
            var yearData = [4, 25, 5, 2, 1, 1, 1, 1, 2, 1];
            var myChart = echarts.init(document.querySelector(".line .chart"));
            myChart.clear();
            clearInterval(timer);
            var option = {
                color: ['#34bca3', '#34bca3'],
                tooltip: {
                    trigger: 'axis'
                },
                dataZoom: [
                    {
                        id: 'dataZoomX',
                        show: false,
                        type: 'slider',
                        xAxisIndex: [0],
                        filterMode: 'filter', // 设定为 'filter' 从而 X 的窗口变化会影响 Y 的范围。
                        startValue: 0,
                        endValue: 7
                    }
                ],
                legend: {
                    // data: ['入选联合国教科文组织非物质文化遗产名录（名册）项目'],
                    textStyle: {
                        color: "#4c9bfd",
                        fontSize: 9
                    },
                    right: "10%",
                    itemWidth: 18,
                    itemHeight: 11
                },
                grid: {
                    top: '15%',
                    left: '2%',
                    right: '4%',
                    bottom: '0%',
                    show: false,// 显示边框
                    borderColor: '#012f4a',// 边框颜色
                    containLabel: true // 包含刻度文字在内
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: ['2008', '2009', '2010', '2011', '2012', '2013', '2016', '2018', '2020', '2022'],
                    axisTick: {
                        show: false // 去除刻度线
                    },
                    axisLabel: {
                        color: '#08544c', // 文本颜色
                        fontSize: 8.5
                    },
                    axisLine: {
                        show: false // 去除轴线
                    }
                },
                yAxis: {
                    type: 'value',
                    axisTick: {
                        show: false // 去除刻度线
                    },
                    axisLabel: {
                        color: '#08544c', // 文本颜色
                        fontSize: 8.5
                    },
                    axisLine: {
                        show: false // 去除轴线
                    },
                    boundaryGap: false, // 去除轴内间距
                    splitLine: {
                        show: true
                    }
                },
                series: [
                    {
                        name: '',
                        type: 'line',
                        data: yearData,
                        smooth: true
                    }
                ]
            };

            // 使用刚指定的配置项和数据显示图表。
            timer = setInterval(function () {
                // 每次向后滚动一个，最后一个从头开始。
                if (option.dataZoom[0].endValue == 12 - 1) {
                    option.dataZoom[0].endValue = 5;
                    option.dataZoom[0].startValue = 0;
                }
                else {
                    option.dataZoom[0].endValue = option.dataZoom[0].endValue + 1;
                    option.dataZoom[0].startValue = option.dataZoom[0].startValue + 1;
                }
                myChart.setOption(option, true);
            }, 2500);



            myChart.clear();
            myChart.setOption(option, true);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //折线图-右2
        (function () {
            var myChart = echarts.init(document.querySelector(".line2 .chart"));
            var timer = null;
            myChart.clear();
            clearInterval(timer);

            var option = {
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        label: {
                            backgroundColor: '#6a7985'
                        }
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
                        endValue: 6
                    }
                ],
                legend: {
                    data: ['产品及品牌数量', '生产经营单位数量'],
                    textStyle: {
                        color: "rgba(0,0,0,.5",
                        fontSize: 9
                    },
                    itemHeight: 12,
                    itemWidth: 20,
                    top: "0%"
                },
                grid: {
                    left: '10',
                    top: "25",
                    right: '10',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
                        boundaryGap: false,
                        data: ['2013年', '2015年', '2017年', '2019年第1批', '2019年第2批', '2019年第3批', '2019年第4批', '2020年第1批'],
                        axisLabel: {
                            textStyle: {
                                color: "#08544c",
                                fontSize: 10
                            }
                        },
                        axisLine: {
                            lineStyle: {
                                color: "rgba(255,255,255,0.2)"
                            }
                        },
                        axisTick: {
                            show: false
                        }
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        axisTick: { show: false },
                        axisLine: {
                            lineStyle: {
                                color: "rgba(255,255,255,.1)"
                            }
                        },
                        axisLabel: {
                            textStyle: {
                                color: "#08544c",
                                fontSize: 12
                            }
                        },
                        // 修改分割线的颜色
                        splitLine: {
                            lineStyle: {
                                show: true
                            }
                        }
                    }
                ],
                series: [
                    {
                        name: '产品及品牌数量',
                        type: 'line',
                        //填充颜色设置
                        areaStyle: {
                            color: new echarts.graphic.LinearGradient(
                                0,
                                0,
                                0,
                                1,
                                [
                                    {
                                        offset: 0,
                                        color: "rgba(1, 132, 213, 0.4)"   // 渐变色的起始颜色
                                    },
                                    {
                                        offset: 0.8,
                                        color: "rgba(1, 132, 213, 0.1)"   // 渐变线的结束颜色
                                    }
                                ],
                                false
                            ),
                            shadowColor: "rgba(0, 0, 0, 0.1)"
                        },
                        symbol: "circle",
                        symbolSzie: 5,
                        showSymbol: false,
                        itemStyle: {
                            color: "#0184d5",
                            borderColor: "rgba(221, 220, 107, .1)",
                            borderWidth: 12
                        },
                        smooth: true,
                        emphasis: {
                            focus: 'series'
                        },
                        lineStyle: {
                            color: "#0184d5",
                            width: 2
                        },
                        data: [679, 731, 680, 88, 34, 124, 156, 153]
                    },
                    {
                        name: '生产经营单位数量',
                        type: 'line',
                        areaStyle: {
                            color: new echarts.graphic.LinearGradient(
                                0,
                                0,
                                0,
                                1,
                                [
                                    {
                                        offset: 0,
                                        color: "rgba(0, 216, 135, 0.4)"
                                    },
                                    {
                                        offset: 0.8,
                                        color: "rgba(0, 216, 135, 0.1)"
                                    }
                                ],
                                false
                            ),
                            shadowColor: "rgba(0, 0, 0, 0.1)"
                        },
                        // 设置拐点 小圆点
                        symbol: "circle",
                        // 拐点大小
                        symbolSize: 5,
                        // 设置拐点颜色以及边框
                        itemStyle: {
                            color: "#00d887",
                            borderColor: "rgba(221, 220, 107, .1)",
                            borderWidth: 12
                        },
                        // 开始不显示拐点， 鼠标经过显示
                        showSymbol: false,
                        smooth: true,
                        emphasis: {
                            focus: 'series'
                        },
                        lineStyle: {
                            color: "#00d887",
                            width: 2
                        },
                        data: [784, 941, 896, 226, 92, 344, 372, 265]
                    }
                ]
            };

            // 使用刚指定的配置项和数据显示图表。
            timer = setInterval(function () {
                // 每次向后滚动一个，最后一个从头开始。
                if (option.dataZoom[0].endValue == 8 - 1) {
                    option.dataZoom[0].endValue = 6;
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

        //饼图-右侧
        (function () {
            var myChart = echarts.init(document.querySelector(".pie2 .chart"));
            var option = {
                color: ['#006cff', '#60cda0', '#ed8884', '#ff9f7f', '#0096ff', '#9fe6b8', '#32c5e9', '#1d9dff'],
                legend: {
                    left: 'center',
                    bottom: 0,
                    itemHeight: 10,
                    itemWidth: 10,
                    textStyle: {
                        color: "#08544c",
                        fontSize: 9
                    }
                },
                tooltip: {

                },
                series: [
                    {
                        name: '画片数量',
                        type: 'pie',
                        radius: ["15%", "72%"],
                        center: ['50%', '42%'],
                        roseType: 'radius',
                        itemStyle: {
                            borderRadius: 3
                        },
                        label: {
                            fontSize: 10
                        },
                        labelLine: {
                            length: 5,
                            length2: 10
                        },
                        data: [
                            { value: 36, name: '内蒙古' },
                            { value: 29, name: '新疆' },
                            { value: 25, name: '云南' },
                            { value: 20, name: '贵州' },
                            { value: 17, name: '江苏' },
                            { value: 14, name: '山东' },
                            { value: 11, name: '四川' },
                        ]
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
            echarts.registerMap("china", chinaJson);

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
                        var img = params.name;
                        if (img == "内蒙古自治区") img = "内蒙古2"
                        if (img == "新疆维吾尔自治区") img = "新疆"
                        if (img == "青海省") img = "青海"
                        if (img == "四川省") img = "四川1"
                        // else img = "内蒙古3"

                        return `<div style="width:180px; height:max-content;">
                        <div style="display: inline-block; text-align:center; width:100%; color: #08544c; font-size: 10px">${params.name}</div>

                        <div style="width: max-content; margin: 5px auto;">
                            <img style="width: 180px; height: 100%;" src=${require("../../assets/huapian/" + img + ".png")} alt="图片加载失败">
                        </div>
                        
                        </div>
                        `;
                    },
                },
                series: [
                    {
                        type: "map",
                        map: "china",
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
                        // data: [
                        //     { name: "西藏", value: "101" },
                        //     { name: "黑龙江省", value: "202" },
                        // ],
                    }
                ],


            };
            myChart.setOption(option);

            // 监听鼠标移入移出事件

            myChart.on('mouseover', e => {
                setTimeout(function () {
                    if (e.name == "内蒙古自治区") {
                        // document.body.style.backgroundImage = `url('https://img.freepik.com/free-vector/colorful-farm-landscape-cartoon-style_52683-16677.jpg?w=1800&t=st=1679123156~exp=1679123756~hmac=2a5e8b7b5d234bd76617b150f67c03c3cc5f81a0010fd78949d9d782ba6e1c4b')`

                        const bgImg = document.getElementsByClassName("bg-img-neimenggu")
                        console.log(bgImg)
                        for (var i = 0; i < bgImg.length; i++) {
                            bgImg[i].style.display = "block";
                        };
                    }

                    else if (e.name == "新疆维吾尔自治区") {
                        // document.body.style.backgroundImage = `url('https://img.freepik.com/free-vector/colorful-farm-landscape-cartoon-style_52683-16677.jpg?w=1800&t=st=1679123156~exp=1679123756~hmac=2a5e8b7b5d234bd76617b150f67c03c3cc5f81a0010fd78949d9d782ba6e1c4b')`

                        const bgImg = document.getElementsByClassName("bg-img-xinjiang")
                        console.log(bgImg)
                        for (var i = 0; i < bgImg.length; i++) {
                            bgImg[i].style.display = "block";
                        };
                    }

                    else if (e.name == "青海省") {
                        // document.body.style.backgroundImage = `url('https://img.freepik.com/free-vector/colorful-farm-landscape-cartoon-style_52683-16677.jpg?w=1800&t=st=1679123156~exp=1679123756~hmac=2a5e8b7b5d234bd76617b150f67c03c3cc5f81a0010fd78949d9d782ba6e1c4b')`

                        const bgImg = document.getElementsByClassName("bg-img-qinghai")
                        console.log(bgImg)
                        for (var i = 0; i < bgImg.length; i++) {
                            bgImg[i].style.display = "block";
                        };
                    }

                    else if (e.name == "四川省") {
                        // document.body.style.backgroundImage = `url('https://img.freepik.com/free-vector/colorful-farm-landscape-cartoon-style_52683-16677.jpg?w=1800&t=st=1679123156~exp=1679123756~hmac=2a5e8b7b5d234bd76617b150f67c03c3cc5f81a0010fd78949d9d782ba6e1c4b')`

                        const bgImg = document.getElementsByClassName("bg-img-sichuan")
                        console.log(bgImg)
                        for (var i = 0; i < bgImg.length; i++) {
                            bgImg[i].style.display = "block";
                        };
                    }

                }, 0);
            })

            myChart.on('mouseout', e => {
                if (e.name == "内蒙古自治区") {
                    const bgImg = document.getElementsByClassName("bg-img-neimenggu");
                    for (var i = 0; i < bgImg.length; i++) {
                        bgImg[i].style.display = "none";
                    };
                }

                else if (e.name == "新疆维吾尔自治区") {
                    const bgImg = document.getElementsByClassName("bg-img-xinjiang");
                    for (var i = 0; i < bgImg.length; i++) {
                        bgImg[i].style.display = "none";
                    };
                }

                else if (e.name == "青海省") {
                    const bgImg = document.getElementsByClassName("bg-img-qinghai");
                    for (var i = 0; i < bgImg.length; i++) {
                        bgImg[i].style.display = "none";
                    };
                }

                else if (e.name == "四川省") {
                    const bgImg = document.getElementsByClassName("bg-img-sichuan");
                    for (var i = 0; i < bgImg.length; i++) {
                        bgImg[i].style.display = "none";
                    };
                }

            })

            myChart.on('click', e => {
                if (e.name == "四川省") {
                    location.href = ' http://127.0.0.1:8081/front/huapianProvince';
                    // this.$router.push({ path: '/feiyiMain'});
                }
            })

        })();

    }
}

</script>

<style scoped>
.bg {
    position: fixed;
    width: 1520px;
    height: 100px;
    bottom: 0px;
    left: -60px;
    background-size: 100%;
    background-repeat: no-repeat;
    opacity: 0.7;
}

.bg-img-neimenggu {
    display: none;
    position: fixed;
    left: 0;
    top: 0;
    /* 这里因为用的图片是四合一的，所以进行了放大处理 */
    width: 220%;
    height: 200%;
    object-position: left top;
    filter: blur(20px);
    transform: scale(1.05);
    opacity: 0.3
}

.bg-img-xinjiang {
    display: none;
    position: fixed;
    left: 0;
    top: 0;
    /* 这里因为用的图片是四合一的，所以进行了放大处理 */
    width: 220%;
    height: 200%;
    object-position: left top;
    filter: blur(20px);
    transform: scale(1.05);
    opacity: 0.3
}

.bg-img-qinghai {
    display: none;
    position: fixed;
    left: 0;
    top: 0;
    /* 这里因为用的图片是四合一的，所以进行了放大处理 */
    width: 220%;
    height: 200%;
    object-position: left top;
    filter: blur(20px);
    transform: scale(1.05);
    opacity: 0.3
}

.bg-img-sichuan {
    display: none;
    position: fixed;
    left: 0;
    top: 0;
    /* 这里因为用的图片是四合一的，所以进行了放大处理 */
    width: 220%;
    height: 200%;
    object-position: left top;
    filter: blur(20px);
    transform: scale(1.05);
    opacity: 0.3
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
    position: fixed;
    bottom: 10px;
    right: 370px;
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
    flex: 2.5;
}

.mainbox .column:nth-child(2) {
    flex: 5;
    margin: 0 0.125rem 0.1875rem;
    overflow: hidden;
}

.mainbox .panel {
    position: relative;
    height: 3.95rem;
    padding: 2px;
    margin: 0 5px 10px 5px;
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
    height: 3rem;
}

.mainbox .no {
    position: relative;
    background: rgba(200, 229, 218, .3);
    padding: 0.1875rem;
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
}</style>