<template>
    <div style="width: 100%; heigh: 100%;">
        <full-page :options="options" ref="fullpage">
            <div class="section">
                <div style="position: absolute; left: 380px; top: 0; z-index: -1;">
                    <img src="../../assets/feiyi-bg-right.png" style="width: 90%; height: 100vh;">
                </div>
                <div class="mainbox">
                    <div class="column">
                        <div class="hot">
                            <div class="show_title">
                                <h2>非遗产品热门榜</h2>
                                <p>每小时更新</p>
                            </div>
                            <div class="show_item">
                                <el-row>
                                    <el-col :span="24">
                                        <div class="grid-content bg-color"></div>
                                        <a href="#">
                                            <div class="rk-detail1"></div>
                                        </a>
                                        <h2>1</h2>
                                        <p>察干伊德制作技艺</p>
                                        <p style="font-size: 14px; top: 57px;">内蒙古自治区正蓝旗</p>
                                    </el-col>
                                    <el-col :span="24">
                                        <div class="grid-content bg-color"></div>
                                        <a href="#">
                                            <div class="rk-detail2"></div>
                                        </a>
                                        <h2>2</h2>
                                        <p>加牙藏族织毯技艺</p>
                                        <p style="font-size: 14px; top: 57px;">青海省湟中县</p>
                                    </el-col>
                                    <el-col :span="24">
                                        <div class="grid-content bg-color"></div>
                                        <a href="#">
                                            <div class="rk-detail3"></div>
                                        </a>
                                        <h2>3</h2>
                                        <p>合浦角雕</p>
                                        <p style="font-size: 14px; top: 57px;">广西壮族自治区北海市合浦县</p>
                                    </el-col>
                                    <el-col :span="24">
                                        <div class="grid-content bg-color"></div>
                                        <a href="#">
                                            <div class="rk-detail4"></div>
                                        </a>
                                        <h2>4</h2>
                                        <p>壮族油纸伞制作技艺</p>
                                        <p style="font-size: 14px; top: 57px;">广西壮族自治区贵港市</p>
                                    </el-col>
                                    <el-col :span="24">
                                        <div class="grid-content bg-color"></div>
                                        <a href="#">
                                            <div class="rk-detail5"></div>
                                        </a>
                                        <h2>5</h2>
                                        <p>傣族象脚鼓制作技艺</p>
                                        <p style="font-size: 14px; top: 57px;">云南省临沧市临翔区</p>
                                    </el-col>
                                </el-row>
                            </div>
                        </div>
                    </div>

                    <div class="column" style="margin-top: 70px;">
                        <div class="font_fzqkbysjt">
                            <h2 style="color: #08544c; font-size: 30px; margin: 10px 0 10px 20px">何为非遗</h2>
                            <p style="color: #272727; font-size: 18px; margin: 0 20px; line-height: 1.5;">
                                非物质文化遗产，是指各族人民世代相传并视为其文化遗产组成部分的各种传统文化表现形式，以及与传统文化表现形式相关的实物和场所。我国的民族地区往往是贫困问题最集中的地区，许多民族地区利用丰富的非物质文化遗产资源、独特的民族风情和旖旎的自然风光发展文化产业，走上了乡村振兴的道路。
                            </p>
                        </div>
                        <div style="width: 600px; height: 550px; margin: 10px 0 10px 20px">
                            <div class="force" style="width: 600px; height: 530px; margin-top: 0px;"></div>
                        </div>

                    </div>

                    <div class="column" style="margin-top: 70px; margin-right: 10px;">
                        <div class="panel">
                            <h2 style="margin-bottom: -10px;">非遗网店相关状况</h2>
                            <div class="pie" style="float: left; width: 175px;">
                                <h2>非遗网店店铺运营时间</h2>
                                <div class="chart"></div>
                            </div>
                            <div class="pie2" style="float: left; width: 186px;">
                                <h2>非遗网店手艺人居住区域</h2>
                                <div class="chart"></div>
                            </div>
                            <div class="panel-footer"></div>
                        </div>
                        <div class="panel bar2">
                            <h2>新媒体平台国家级非遗项目涵盖率</h2>
                            <div class="chart">图表</div>
                            <div class="panel-footer"></div>
                        </div>
                        <div class="panel wordcloud">
                            <h2>非遗产品热词一览</h2>
                            <div class="chart" style="margin-top: -15px; height: 250px;"></div>
                        </div>
                    </div>



                </div>
            </div>

            <div class="section">
                <div style="width: 100px; height: 40px;"></div>
                <!-- box的高度需要改 -->
                <div class="box">
                    <el-tabs class="show" v-model="activeName_xihuan" @tab-click="handleClick_xihuan">
                        <el-tab-pane label="猜你喜欢" name="first_xihuan">
                            <el-row :gutter="30">
                                <el-col v-for="item in feiyiList" :key="item" :span="6">
                                    <router-link
                                        :to="{ name: 'feiyiItem', params: { name: item.name, location: item.location, intro: item.intro, image: item.image } }">
                                        <div class="show-content">
                                            <img :src="require('../../assets/' + item.image)"
                                                style="object-fit: cover; object-position: top;" />
                                            <h2>{{ item.name }}</h2>
                                            <p>{{ item.location }}</p>
                                        </div>
                                    </router-link>
                                </el-col>
                            </el-row>
                        </el-tab-pane>
                        <el-tab-pane label="河南" name="second_feiyi">
                            <el-row :gutter="30">
                                <el-col :span="6">
                                    <a href="#">
                                        <div class="show-content">
                                            <img style="object-fit: cover; object-position: top;"
                                                src="../../images/show1-1-1.jpg" />
                                            <h2>河南省什么市什么县</h2>
                                            <p> 这里的非遗真是棒</p>
                                        </div>
                                    </a>
                                </el-col>

                            </el-row>
                        </el-tab-pane>

                    </el-tabs>
                </div>

                <div class="pagination">
                    <div class="block">
                        <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange"
                            :current-page="currentPage" :page-sizes="[8, 16, 24, 32]" :page-size="16"
                            layout="total, sizes, prev, pager, next, jumper" :total="40">
                        </el-pagination>
                    </div>
                </div>
            </div>
        </full-page>
    </div>
</template>

<script>

import request from "@/utils/request";
import * as echarts from 'echarts'
import 'echarts-wordcloud';
import "../../fonts/FZQKBYSJW.css";

import '../../js/flexible'

import feyidata from '@/assets/feiyi.json'
import ciyunData from '../../assets/ciyun.json'

export default {
    name: "feiyiMain",
    data() {
        return {
            feiyiList: feyidata.data,
            activeName_xihuan: 'first_xihuan',
            currentPage: 1,
            options: {
                licenseKey: 'OPEN-SOURCE-GPLV3-LICENSE',
                afterLoad: this.afterLoad,
                scrollOverflow: true,
                scrollBar: false,
                navigation: true,
            },
        }
    },
    methods: {
        handleClick_xihuan(tab, event) {
            console.log(tab, event);
        },
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
        },
        next() {
            // 向下滚动一页
            this.$refs.fullpage.api.moveSectionDown();
        }
    },
    mounted() {
        //饼图
        (function () {
            var myChart = echarts.init(document.querySelector(".pie .chart"));
            var option = {
                color: [
                    "#065aab",
                    "#066eab",
                    "#0682ab",
                    "#0696ab",
                    // "#06a0ab",
                ],
                tooltip: {
                    trigger: "item",
                    formatter: "{b}: {d}%"
                },
                legend: {
                    bottom: '10px',
                    itemHeight: 10,
                    itemWidth: 10,
                    data: ["1年以下", "1-3年", "3-5年", "5年以上"],
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
                        center: ["50%", "33%"],
                        radius: ['30%', '65%'],
                        avoidLabelOverlap: false,
                        label: {
                            show: false,
                            position: 'center'
                        },
                        labelLine: {
                            show: false
                        },
                        itemStyle: {
                            borderRadius: 0
                        },
                        data: [
                            { value: 6, name: "1年以下" },
                            { value: 21, name: "1-3年" },
                            { value: 20, name: "3-5年" },
                            { value: 53, name: "5年以上" },
                        ]
                    }
                ]
            };
            myChart.setOption(option);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //饼图-右侧
        (function () {
            var myChart = echarts.init(document.querySelector(".pie2 .chart"));
            var option = {
                color: ['#006cff', '#60cda0', '#ed8884', '#ff9f7f', '#9fe6b8', '#32c5e9', '#1d9dff'],
                legend: {
                    left: 'center',
                    bottom: '10px',
                    itemHeight: 10,
                    itemWidth: 10,
                    textStyle: {
                        color: "#08544c",
                        fontSize: 9
                    }
                },
                tooltip: {
                    trigger: "item",
                    formatter: "{b}: {c}%"
                },
                series: [
                    {
                        name: '地区分布',
                        type: 'pie',
                        radius: ["15%", "72%"],
                        center: ['50%', '37%'],
                        roseType: 'radius',
                        itemStyle: {
                            borderRadius: 3
                        },
                        label: {
                            show:false,
                            fontSize: 10
                        },
                        labelLine: {
                            length: 5,
                            length2: 10
                        },
                        data: [
                            { value: 36, name: '低级城市' },
                            { value: 30, name: '省会城市' },
                            { value: 28, name: '县级城市' },
                            { value: 20, name: '一线城市' },
                            { value: 17, name: '农村' },
                            { value: 10, name: '乡镇' },
                        ]
                    }
                ]
            };
            myChart.setOption(option);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //柱状图
        (function () {
            var myChart = echarts.init(document.querySelector(".bar2 .chart"));
            var timer = null;
            myChart.clear();
            clearInterval(timer);

            var SData = [62, 77, 97.9, 99.42];

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
                    left: '1%',
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
                    data: ['淘宝', '腾讯看点', '快手','抖音'],
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
                    splitLine: {show: false }
                },
                series: [
                    {
                        name: '国家级非遗项目涵盖率（百分比）',
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

        //词云
        (function () {
            var SData = {
                value: ciyunData.value,
                // image: "data:image/png;base64,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"
                image: "data:image/png;base64,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",

            }
            var maskImage = new Image();
            maskImage.src = SData.image

            var myChart = echarts.init(document.querySelector(".wordcloud .chart"));

            var option = {
                backgroundColor: 'transparent',
                tooltip: {
                },
                series: [{
                    type: 'wordCloud',
                    gridSize: 1,
                    sizeRange: [6, 12],
                    rotationRange: [-45, 0, 45, 90],
                    maskImage: maskImage,
                    textStyle: {
                        color: function () {
                            return 'rgb(' + [

                                Math.round(Math.random() * 50),
                                Math.round(Math.random() * 200) + 20,
                                Math.round(Math.random() * 50)
                            ].join(',') + ')';
                        }
                    },
                    // textStyle: {
                    //     color: function () {
                    //         return 'rgb(' + [
                    //             Math.round(Math.random() * 160),
                    //             Math.round(Math.random() * 160),
                    //             Math.round(Math.random() * 160)
                    //         ].join(',') + ')';
                    //     }
                    // },
                    emphasis: {
                        textStyle: {
                            shadowBlur: 10,
                            shadowColor: '#333'
                        }
                    },
                    left: 'center',
                    top: 'center',
                    width: '100%',
                    height: '100%',
                    right: null,
                    bottom: null,

                    data: SData.value
                }]
            };

            myChart.setOption(option, true);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        //force
        (function () {
            var myChart = echarts.init(document.querySelector(".force"));
            var categories = [{}];


            var option = {
                // 图的标题
                title: {
                    text: '非遗技术知识图谱'
                },
                // 提示框的配置
                tooltip: {
                    formatter: function (x) {
                        return x.data.des;
                    }
                },

                legend: [{
                    left: 0,
                    top: 30,
                    // selectedMode: 'single',
                    //设置可以根据类别显示or隐藏节点
                    data: categories.map(function (a) {
                        return a.name;
                    })
                }],
                roam: false,
                series: [{
                    type: 'graph', // 类型:关系图
                    layout: 'force', //图的布局，类型为力导图
                    symbolSize: 40, // 调整节点的大小
                    roam: true, // 是否开启鼠标缩放和平移漫游。默认不开启。如果只想要开启缩放或者平移,可以设置成 'scale' 或者 'move'。设置成 true 为都开启
                    edgeSymbol: ['circle'],
                    edgeSymbolSize: [2, 10],
                    edgeLabel: {
                        normal: {
                            textStyle: {
                                fontSize: 20
                            }
                        }
                    },
                    force: {
                        repulsion: 500,
                        edgeLength: [5, 10]
                    },
                    draggable: true,
                    lineStyle: {
                        normal: {
                            width: 1,
                            color: '#4b565b',
                        }
                    },
                    edgeLabel: {
                        normal: {
                            show: true,
                            formatter: function (x) {
                                return x.data.name;
                            }
                        }
                    },
                    label: {
                        normal: {
                            show: true,
                            textStyle: {}
                        }
                    },
                    zoom: 0.85,

                    "data": [
                        {
                            name: "云锦", des: "云锦", symbolSize: 43, itemStyle: {
                                color: "#ff9f7f"
                            }
                        },
                        {
                            name: "雕刻", des: "雕刻", symbolSize: 60, itemStyle: {
                                color: "#ed8884"
                            }
                        },
                        {
                            name: "绣", des: "绣", symbolSize: 39, itemStyle: {
                                color: "#60cda0"
                            }
                        },
                        {
                            name: "剪纸", des: "剪纸", symbolSize: 32, itemStyle: {
                                color: "#ed8884"
                            }
                        },
                        {
                            name: "彩绘", des: "彩绘", symbolSize: 27, itemStyle: {
                                color: "#32c5e9"
                            }
                        },
                        {
                            name: "套印", des: "套印", symbolSize: 33, itemStyle: {
                                color: "#0096ff"
                            }
                        },
                        {
                            name: "手绘", des: "手绘", symbolSize: 31, itemStyle: {
                                color: "#9fe6b8"
                            }
                        },
                        {
                            name: "龙纹", des: "龙纹", symbolSize: 54, itemStyle: {
                                color: "#9fe6b8"
                            }
                        },
                        {
                            name: "织金", des: "织金", symbolSize: 44, itemStyle: {
                                color: "#ff9f7f"
                            }
                        },
                        {
                            name: "彩绣", des: "彩绣", symbolSize: 47, itemStyle: {
                                color: "#ed8884"
                            }
                        },
                        {
                            name: "木版年画", des: "木版年画", symbolSize: 42, itemStyle: {
                                color: "#0096ff"
                            }
                        },
                        {
                            name: "堆金", des: "堆金", symbolSize: 30, itemStyle: {
                                color: "#1d9dff"
                            }
                        },
                        {
                            name: "青花", des: "青花", symbolSize: 32, itemStyle: {
                                color: "#60cda0"
                            }
                        },
                        {
                            name: "缂丝", des: "缂丝", symbolSize: 40, itemStyle: {
                                color: "#ff9f7f"
                            }
                        },
                        {
                            name: "鎏金", des: "鎏金", symbolSize: 68, itemStyle: {
                                color: "#32c5e9"
                            }
                        },
                        {
                            name: "戗金彩漆", des: "戗金彩漆", symbolSize: 28, itemStyle: {
                                color: "#ed8884"
                            }
                        },
                        {
                            name: "漆器", des: "漆器", symbolSize: 43, itemStyle: {
                                color: "#60cda0"
                            }
                        },
                        {
                            name: "剔红", des: "剔红", symbolSize: 42, itemStyle: {
                                color: "#1d9dff"
                            }
                        },
                        {
                            name: "剔彩", des: "剔彩", symbolSize: 24, itemStyle: {
                                color: "#ed8884"
                            }
                        },
                        {
                            name: "珐琅", des: "珐琅", symbolSize: 34, itemStyle: {
                                color: "#1d9dff"
                            }
                        },
                        {
                            name: "描金", des: "描金", symbolSize: 51, itemStyle: {
                                color: "#006cff"
                            }
                        },
                        {
                            name: "掐丝珐琅", des: "掐丝珐琅", symbolSize: 62, itemStyle: {
                                color: "#32c5e9"
                            }
                        },
                        {
                            name: "平绣", des: "平绣", symbolSize: 28, itemStyle: {
                                color: "#1d9dff"
                            }
                        },
                        {
                            name: "金绣", des: "金绣", symbolSize: 47, itemStyle: {
                                color: "#9fe6b8"
                            }
                        },
                        {
                            name: "钉金绣", des: "钉金绣", symbolSize: 50, itemStyle: {
                                color: "#1d9dff"
                            }
                        },
                        {
                            name: "镶边", des: "镶边", symbolSize: 51, itemStyle: {
                                color: "#ed8884"
                            }
                        },
                        {
                            name: "刺绣", des: "刺绣", symbolSize: 23, itemStyle: {
                                color: "#32c5e9"
                            }
                        },
                        {
                            name: "蜡染", des: "蜡染", symbolSize: 65, itemStyle: {
                                color: "#ff9f7f"
                            }
                        },
                        {
                            name: "纱绣", des: "纱绣", symbolSize: 35, itemStyle: {
                                color: "#60cda0"
                            }
                        },
                        {
                            name: "贴布绣", des: "贴布绣", symbolSize: 70, itemStyle: {
                                color: "#1d9dff"
                            }
                        },
                        {
                            name: "贴绣", des: "贴绣", symbolSize: 70, itemStyle: {
                                color: "#ff9f7f"
                            }
                        },
                        {
                            name: "平金银绣", des: "平金银绣", symbolSize: 44, itemStyle: {
                                color: "#9fe6b8"
                            }
                        },
                        {
                            name: "金银迭绣", des: "金银迭绣", symbolSize: 42, itemStyle: {
                                color: "#ed8884"
                            }
                        },
                        {
                            name: "浮雕", des: "浮雕", symbolSize: 46, itemStyle: {
                                color: "#0096ff"
                            }
                        },
                        {
                            name: "贴花", des: "贴花", symbolSize: 40, itemStyle: {
                                color: "#006cff"
                            }
                        },
                        {
                            name: "印金", des: "印金", symbolSize: 58, itemStyle: {
                                color: "#9fe6b8"
                            }
                        },
                        {
                            name: "釉里红", des: "釉里红", symbolSize: 54, itemStyle: {
                                color: "#006cff"
                            }
                        },
                        {
                            name: "珐琅彩", des: "珐琅彩", symbolSize: 51, itemStyle: {
                                color: "#9fe6b8"
                            }
                        },
                        {
                            name: "镂雕", des: "镂雕", symbolSize: 42, itemStyle: {
                                color: "#006cff"
                            }
                        },
                        {
                            name: "绞绣", des: "绞绣", symbolSize: 24, itemStyle: {
                                color: "#0096ff"
                            }
                        },
                        {
                            name: "点翠", des: "点翠", symbolSize: 51, itemStyle: {
                                color: "#006cff"
                            }
                        },
                        {
                            name: "玉雕", des: "玉雕", symbolSize: 54, itemStyle: {
                                color: "#ff9f7f"
                            }
                        },
                        {
                            name: "石刻", des: "石刻", symbolSize: 29, itemStyle: {
                                color: "#9fe6b8"
                            }
                        },
                        {
                            name: "石雕", des: "石雕", symbolSize: 62, itemStyle: {
                                color: "#60cda0"
                            }
                        },
                        {
                            name: "黑漆描金", des: "黑漆描金", symbolSize: 42, itemStyle: {
                                color: "#1d9dff"
                            }
                        },
                        {
                            name: "木雕", des: "木雕", symbolSize: 31, itemStyle: {
                                color: "#ff9f7f"
                            }
                        },
                        {
                            name: "京绣", des: "京绣", symbolSize: 44, itemStyle: {
                                color: "#9fe6b8"
                            }
                        },
                        {
                            name: "捻花", des: "捻花", symbolSize: 55, itemStyle: {
                                color: "#32c5e9"
                            }
                        },
                        {
                            name: "塑贴", des: "塑贴", symbolSize: 30, itemStyle: {
                                color: "#006cff"
                            }
                        },
                        {
                            name: "夹缬", des: "夹缬", symbolSize: 26, itemStyle: {
                                color: "#006cff"
                            }
                        },
                        {
                            name: "双针绣", des: "双针绣", symbolSize: 67, itemStyle: {
                                color: "#006cff"
                            }
                        },
                        {
                            name: "象牙雕", des: "象牙雕", symbolSize: 25, itemStyle: {
                                color: "#32c5e9"
                            }
                        },
                        {
                            name: "彩绘陶", des: "彩绘陶", symbolSize: 38, itemStyle: {
                                color: "#60cda0"
                            }
                        },
                        {
                            name: "纸扎", des: "纸扎", symbolSize: 39, itemStyle: {
                                color: "#0096ff"
                            }
                        },
                        {
                            name: "瓷鱼", des: "瓷鱼", symbolSize: 47, itemStyle: {
                                color: "#0096ff"
                            }
                        },
                        {
                            name: "工艺列表", des: "工艺列表", symbolSize: 32, itemStyle: {
                                color: "#006cff"
                            }
                        }
                    ],
                    "links": [
                        {
                            target: "工艺列表", source: "云锦", name: ""
                        },
                        {
                            target: "工艺列表", source: "雕刻", name: ""
                        },
                        {
                            target: "工艺列表", source: "绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "剪纸", name: ""
                        },
                        {
                            target: "工艺列表", source: "彩绘", name: ""
                        },
                        {
                            target: "工艺列表", source: "套印", name: ""
                        },
                        {
                            target: "工艺列表", source: "手绘", name: ""
                        },
                        {
                            target: "工艺列表", source: "龙纹", name: ""
                        },
                        {
                            target: "工艺列表", source: "织金", name: ""
                        },
                        {
                            target: "工艺列表", source: "彩绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "木版年画", name: ""
                        },
                        {
                            target: "工艺列表", source: "堆金", name: ""
                        },
                        {
                            target: "工艺列表", source: "青花", name: ""
                        },
                        {
                            target: "工艺列表", source: "缂丝", name: ""
                        },
                        {
                            target: "工艺列表", source: "鎏金", name: ""
                        },
                        {
                            target: "工艺列表", source: "戗金彩漆", name: ""
                        },
                        {
                            target: "工艺列表", source: "漆器", name: ""
                        },
                        {
                            target: "工艺列表", source: "剔红", name: ""
                        },
                        {
                            target: "工艺列表", source: "剔彩", name: ""
                        },
                        {
                            target: "工艺列表", source: "珐琅", name: ""
                        },
                        {
                            target: "工艺列表", source: "描金", name: ""
                        },
                        {
                            target: "工艺列表", source: "掐丝珐琅", name: ""
                        },
                        {
                            target: "工艺列表", source: "平绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "金绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "钉金绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "镶边", name: ""
                        },
                        {
                            target: "工艺列表", source: "刺绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "蜡染", name: ""
                        },
                        {
                            target: "工艺列表", source: "纱绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "贴布绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "贴绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "平金银绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "金银迭绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "浮雕", name: ""
                        },
                        {
                            target: "工艺列表", source: "贴花", name: ""
                        },
                        {
                            target: "工艺列表", source: "印金", name: ""
                        },
                        {
                            target: "工艺列表", source: "釉里红", name: ""
                        },
                        {
                            target: "工艺列表", source: "珐琅彩", name: ""
                        },
                        {
                            target: "工艺列表", source: "镂雕", name: ""
                        },
                        {
                            target: "工艺列表", source: "绞绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "点翠", name: ""
                        },
                        {
                            target: "工艺列表", source: "玉雕", name: ""
                        },
                        {
                            target: "工艺列表", source: "石刻", name: ""
                        },
                        {
                            target: "工艺列表", source: "石雕", name: ""
                        },
                        {
                            target: "工艺列表", source: "黑漆描金", name: ""
                        },
                        {
                            target: "工艺列表", source: "木雕", name: ""
                        },
                        {
                            target: "工艺列表", source: "京绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "捻花", name: ""
                        },
                        {
                            target: "工艺列表", source: "塑贴", name: ""
                        },
                        {
                            target: "工艺列表", source: "夹缬", name: ""
                        },
                        {
                            target: "工艺列表", source: "双针绣", name: ""
                        },
                        {
                            target: "工艺列表", source: "象牙雕", name: ""
                        },
                        {
                            target: "工艺列表", source: "彩绘陶", name: ""
                        },
                        {
                            target: "工艺列表", source: "纸扎", name: ""
                        },
                        {
                            target: "工艺列表", source: "瓷鱼", name: ""
                        }
                    ],

                    categories: categories,//给类别赋值
                }]
            };

            myChart.setOption(option, true);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();
    }
}
</script>

<style scoped>
* {
    margin: 0;
    padding: 0;
}

.font_fzqkbysjt {
    font-family: fzqkbysjt;
}

.mainbox {
    display: flex;
    min-width: 1024px;
    max-width: 1920px;
    margin: 0px auto;
    padding: 0;
}

.mainbox .column {
    flex: 3;
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

.mainbox .panel h2 {
    height: 0.6rem;
    color: #08544c;
    line-height: 0.6rem;
    text-align: center;
    font-size: 0.25rem;
    font-weight: 400;
}

.mainbox .panel h2 a {
    color: #08544c;
    text-decoration: none;
    margin: 0 0.125rem;
}

.mainbox .chart {
    height: 3rem;
}


.hot {
    position: relative;
    background-image: linear-gradient(to right, #C8E5DA 50%, rgba(200, 229, 218, .3));
    box-shadow: 6px 6px 6px rgba(191, 213, 213, .5), -4px -4px 4px rgba(221, 243, 243, .5);
    height: 820px;
    width: 380px;
}

.show_title {
    position: absolute;
    width: 200px;
    height: 40px;
    left: 20px;
    top: 70px;
}

.show_title h2 {
    font-weight: 400;
    font-size: 26px;
    font-style: italic;
}

.show_title p {
    font-weight: 400;
    font-size: 18px;
    color: #707070;
    font-style: italic;
}

.show_item {
    position: absolute;
    left: 30px;
    top: 145px;
    width: 320px;
}

.show_item .el-row {
    margin-bottom: 20px;
}

.show_item .el-row:last-child {
    margin-bottom: 0;
}

.show_item .el-col {
    position: relative;
    border-radius: 4px;
    transform: skew(-5deg, 0);
    margin: 0 0 25px 0;
}

.show_item .bg-color {
    background: #a7d5c3;
}

.show_item .grid-content {
    border-radius: 4px;
    min-height: 100px;
}

.show_item .el-col h2 {
    position: absolute;
    bottom: 8px;
    left: 20px;
    font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
    font-size: 72px;
    color: rgba(16, 75, 51, .8);
}

.show_item .el-col p {
    position: absolute;
    top: 21px;
    left: 70px;
    font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
    font-size: 22px;
    color: #000;
}

.rk-detail {
    position: absolute;
    top: 0px;
    left: 0px;
    height: 260px;
    width: 183px;
    background-image: linear-gradient(220deg, transparent, #a7d5c3 73%), url("../../images/show1-1-1.jpg");
    background-size: cover;
    border-radius: 4px;
}

.rk-detail1 {
    position: absolute;
    top: 0px;
    left: 0px;
    height: 100%;
    width: 100%;
    background-image: linear-gradient(220deg, transparent, #a7d5c3 73%), url("../../assets/feiyi/察干伊德制作技艺1.jpeg");
    background-size: cover;
    border-radius: 4px;
}

.rk-detail2 {
    position: absolute;
    top: 0px;
    left: 0px;
    height: 100%;
    width: 100%;
    background-image: linear-gradient(220deg, transparent, #a7d5c3 73%), url("../../assets/feiyi/加牙藏族织毯技艺1.jpeg");
    background-size: cover;
    border-radius: 4px;
}

.rk-detail3 {
    position: absolute;
    top: 0px;
    left: 0px;
    height: 100%;
    width: 100%;
    background-image: linear-gradient(220deg, transparent, #a7d5c3 73%), url("../../assets/feiyi/合浦角雕6.jpeg");
    background-size: cover;
    border-radius: 4px;
}

.rk-detail4 {
    position: absolute;
    top: 0px;
    left: 0px;
    height: 100%;
    width: 100%;
    background-image: linear-gradient(220deg, transparent, #a7d5c3 73%), url("../../assets/feiyi/壮族油纸伞制作技艺1.jpeg");
    background-size: cover;
    border-radius: 4px;
}

.rk-detail5 {
    position: absolute;
    top: 0px;
    left: 0px;
    height: 100%;
    width: 100%;
    background-image: linear-gradient(220deg, transparent, #a7d5c3 73%), url("../../assets/feiyi/民族乐器制作技艺（傣族象脚鼓制作技艺）3.jpeg");
    background-size: cover;
    border-radius: 4px;
}

.show {
    position: relative;
    height: 420px;
    width: 1200px !important;
}

.box {
    width: 1200px;
    height: 500px;
    margin: 0 auto !important;
}

.box .el-tabs {
    margin-top: 20px;
}

.box .show #tab-first_xihuan {
    font-size: 24px;
    font-weight: 700;
}

.box .show .el-tabs__item:hover {
    color: #34bca3;
}

.box .show .el-tabs__item.is-active {
    color: #34bca3;
}

.box .show .el-tabs__active-bar {
    background-color: #34bca3;
}

.box .show .el-row:last-child {
    margin-bottom: 0;
}

.box .show .el-col {
    border-radius: 5px;
    margin-bottom: 24px;
}

.box .show .show-content {
    border-radius: 5px;
    height: 220px;
}

.box .show .show-content img {
    border-radius: 5px;
    width: 276px;
    height: 160px;
}

.box .show .show-content h2 {
    /* display: inline-block; */
    font-size: 18px;
    font-weight: 400;
    color: rgb(65, 65, 65);
}

.box .show .show-content p {
    display: inline-block;
    font-size: 14px;
    font-weight: 300;
    color: rgb(120, 120, 120);
}

.pagination {
    width: 530px;
    margin: 0px auto;
    margin-top: 50px;
    margin-bottom: 20px;
}
</style>