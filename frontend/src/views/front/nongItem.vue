<template>
    <div class="feiyiItem_body">
        <div class="bg_right"></div>

        <div class="info">
            <div class="font_fzqkbysjt name">
                <p></p>
                <!-- {{ this.name }} -->
                湟中蚕豆
            </div>
            <div class="font_fzqkbysjt address">
                <!-- {{ this.location }} -->
                青海省西宁市湟中县
            </div>
            <el-rate v-model="value" disabled show-score text-color="#ff9900" score-template="{value}">
            </el-rate>
        </div>
        <div class="img_info">
            <video controls preload width="780px" height="400px"
                poster="../../images/video_poster4.png" data-setup="{}">
                <source src="../../video/3d_1.mp4" />
            </video>
        </div>

        <div class="buy">
            <div class="panel line2">
                <h2>湟中蚕豆价格</h2>
                <div class="chart">图表</div>
                <div class="panel-footer"></div>
            </div>

            <a href="https://www.cnhnb.com/gongying/2944976/" target="https://www.cnhnb.com/gongying/2944976/">
                <el-button class="buy_button" icon="el-icon-s-goods">立即购买</el-button>
            </a>
        </div>

        <div class="font_fzqkbysjt details">
            <p style="font-size: 25px; color: #000; margin: 20px 0 5px 0;">介绍</p>
            <p style="line-height: 1.5;">
                <!-- {{ this.intro }} -->
                蚕豆是世界上重要的食用作物之一。青海由于独特的自然与环境优势，生产的种籽粒大、饱满、病虫感染率低，种子活力强，发芽势强，具有较强的市场竞争力，也是湟中县的优势作物，以粒大饱满、无虫害、无污染等特点，有“圣域蚕豆”之美称。
            </p>

            <p style="font-size: 25px; color: #000; margin: 20px 0 5px 0;">科普辨真</p>
            <div class="kepu">
                <video controls preload width="600px" height="380px" style="margin: 10px;"
                    poster="../../assets/nong/湟中蚕豆1.webp" data-setup="{}">
                    <source src="../../video/982823302_1_0.mp4" />
                </video>

                <div class="kepu_info">
                    <h2>湟中蚕豆</h2>
                    <p style="color: #08544c; font-size: 18px; margin-top: 10px;">作者：青海文化旅游</p>
                    <p style="line-height: 25px;">介绍：湟中蚕豆便是四大名贵蚕豆品种之一,它产于青海省西宁市湟中县,是全国地理标志农产品。</p>
                </div>
            </div>

            <p style="font-size: 25px; color: #000; margin: 20px 0 5px 0;">您的评分</p>
            <el-rate v-model="pingfen" show-text></el-rate>
        </div>

        <div class="font_fzqkbysjt pinglun">
            <p style="font-size: 25px; color: #000; margin: 20px 0 5px 0;">评论</p>
            <el-input type="textarea" :autosize="{ minRows: 2, maxRows: 4 }" placeholder="请输入您的评价" v-model="pinglunArea">
            </el-input>
            <el-button type="success" plain>提交</el-button>

            <div class="comment_info">
                <div style="display: inline-block;">
                    <img
                        src="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202103%2F09%2F20210309094501_jfyix.thumb.1000_0.jpg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1683385382&t=240cd2904883a2e062a7ed20f7f7fd5c">
                    <h2>用户4574</h2>
                </div>
                <div class="comment_right" style="display: inline-block;">
                    <p style="font-size: 10px; font-family:Arial, Helvetica, sans-serif; color: #667; margin: 5px 2px;">
                        2023-04-02 13:28</p>
                    <p>好吃吗亲们？好吃的话我也想去种豆南山下了😆😆</p>
                </div>
            </div>

            <div class="comment_info">
                <div style="display: inline-block;">
                    <img
                        src="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202004%2F07%2F20200407083322_Vw8zW.thumb.1000_0.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1683384561&t=a3e2b3a0543007e68c371565dfa878ea">
                    <h2>用户0042</h2>
                </div>
                <div class="comment_right" style="display: inline-block;">
                    <p style="font-size: 10px; font-family:Arial, Helvetica, sans-serif; color: #667; margin: 5px 2px;">
                        2023-03-25 12:55</p>
                    <p>原产地直销，吃着放心，赞一个！</p>
                </div>
            </div>

            <div class="comment_info">
                <div style="display: inline-block;">
                    <img src="https://img1.baidu.com/it/u=1016138010,1907110459&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500">
                    <h2>用户0132</h2>
                </div>
                <div class="comment_right" style="display: inline-block;">
                    <p style="font-size: 10px; font-family:Arial, Helvetica, sans-serif; color: #667; margin: 5px 2px;">
                        2023-02-22 21:20</p>
                    <p>之前没听说过，这次买了一点尝尝，味道好评！</p>
                </div>
            </div>
        </div>

        <div style="width: 100px%; height: 300px;"></div>
        <div class="feiyiItem_bg" style="position: relative; left: -12.5%;  width: 122.5%;">
            <div class="bg_bottom"></div>
        </div>
    </div>
</template>
  
<script>

import request from "@/utils/request";
import "../../fonts/FZQKBYSJW.css";
import * as echarts from 'echarts'
import '../../js/flexible'

import nongdata from '@/assets/nong.json'

export default {
    name: "nongItem",
    data() {
        return {
            value: 4.7,
            pingfen: null,
            name: "",
            address: "",
            history: "",
            image: "",
            link: "",
            comment: "",
            itemData: nongdata.data,
        }
    },
    created() {
        // 获取参数并根据参数从后端获取数据
        this.name = this.$route.params.name
        this.location = this.$route.params.location
        this.intro = this.$route.params.intro
        this.image = this.$route.params.image
        this.link = this.$route.params.link
    },
    methods: {
        onload() {
            for (let item in this.itemData) {
                if (item.name == this.name) {
                    this.address = item.location
                    this.history = item.intro
                    this.image = item.image
                }
            }

        },
        load() {
            request.get("http://localhost:9090/user/page?pageNum=" + this.pageNum + "&pageSize=" + this.pageSize
                + "&username=" + this.username).then(res => {
                    console.log(res)
                    this.itemData = res.records
                })
        },
        save_comment() {
            request.post("http://localhost:9090/feiyi_comment", this.comment).then(res => {
                console.log(res)
                localStorage.setItem("comment", JSON.stringify(res.data))
            })
        }
    },
    mounted() {
        (function () {
            var myChart = echarts.init(document.querySelector(".line2 .chart"));
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
                legend: {
                    data: ['无规格', '批发价'],
                    textStyle: {
                        color: "#08544c",
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
                        data: ["03-24", "03-25", "03-26", "03-27", "03-28", "03-29", "03-30", "03-31", "04-01", "04-02", "04-03", "04-04", "04-05", "04-06", "04-07", "04-08", "04-09", "04-10", "04-11", "04-12", "04-13", "04-14", "04-15", "04-16", "04-17", "04-18", "04-19", "04-20", "04-21", "04-22"],
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
                                color: "rgba(255,255,255,.1)"
                            }
                        },
                    }
                ],
                series: [
                    {
                        name: '无规格',
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
                        data: [10.78, 13.5, 8.67, 11.4, 16.0, 8.57, 10.3, 8.5, 16.0, 12.0, 10.11, 11.46, 11.61, 16.0, 11.52, 12.12, 10.31, 11.2, 16.0, 10.04, 11.2, 10.31, 12.18, 12.0, 10.07, 16.0, 9.72, 16.0, 4.71, 12.0]
                    },
                    {
                        name: '批发价',
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
                        data: [5.3, 5.3, 5.4, 5.4, 4.5, 4.5, 4.5, 5.2, 4.5, 4.5, 5.4, 5.4, 6.7, 6.7, 6.7, 6.7, 6.5, 6.5, 6.0, 6.0, 6.0, 6.7, 6.7, 6.8, 6.8, 6.8, 6.3, 5.7, 5.1, 4.5]
                    }
                ]
            };
            myChart.setOption(option);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();
    }
}
</script>

<style scoped>
.feiyiItem_body {
    width: 1200px;
    height: 100vh;
    margin: 0 auto;
    padding: 0;
}

.bg_right {
    position: fixed;
    top: 10px;
    right: 60px;
    z-index: -2;
    width: 520px;
    height: 980px;
    background-size: 100%;
    background-repeat: no-repeat;
    background-image: url(../../assets/nong_bg1.png);
    opacity: 0.05;
}

.font_fzqkbysjt {
    font-family: fzqkbysjt;
}

.info {
    position: relative;
    top: 100px;
    left: 0;
    width: 100%;
    height: 100px;
}

.name {
    width: 100%;
    height: 40px;
    line-height: 40px;
    margin: 0px 0 10px 0;
    font-size: 32px;
    font-weight: 400;
}

.name p {
    position: absolute;
    top: -10px;
    left: -12px;
    width: 46px;
    height: 46px;
    border-radius: 30px;
    background-image: linear-gradient(to bottom right, #C8E5DA, #EDF5F5);
    z-index: -1;
}

.address {
    float: left;
    width: 100%;
    height: 20px;
    line-height: 20px;
    margin-bottom: 7px;
    color: #667;
    font-size: 18px;
    font-weight: 100;
}

.info .el-rate {
    float: left;
    width: 100%;
}

.img_info {
    position: relative;
    float: left;
    top: 110px;
    width: 780px;
    height: 400px;
    border-radius: 10px;
    box-shadow: 4px 4px 10px #dcdcdc, -4px -4px 10px #ddf3f3;
    background-image: linear-gradient(to bottom right, #C8E5DA, #EDF5F5);
    background-size: cover;
    background-repeat: no-repeat;
}

.buy {
    display: inline-block;
    position: relative;
    top: 110px;
    margin-left: 40px;
    width: 380px;
    height: 400px;
    border-radius: 10px;
    box-shadow: 4px 4px 10px #dcdcdc, -4px -4px 10px #ddf3f3;
    background-image: linear-gradient(to bottom right, #C8E5DA, #EDF5F5);
}

.buy_img {
    width: 360px;
    height: 320px;
    margin: 10px;
    object-fit: cover;
    border-radius: 8px;
}

.buy_button {
    width: 160px;
    height: 36px;
    margin: 2px 110px;
    font-size: 15px;
    color: #fff;
    background-color: #34bca3;
    border: 0px;
    border-radius: 20px;
}

.buy_button:hover {
    color: #34bca3;
    background-color: #fff;
}

.details {
    position: relative;
    top: 130px;
    color: #667;
    font-size: 16px;
    font-weight: 100;
}

.details p {
    margin: 7px 0;
}

.kepu {
    width: 1200px;
    height: 400px;
    border-radius: 10px;
    box-shadow: 4px 4px 10px #dcdcdc, -4px -4px 10px #ddf3f3;
    background-image: linear-gradient(to bottom right, #C8E5DA, #EDF5F5);
}

.pinglun {
    position: relative;
    width: 100%;
    height: 600px;
    top: 130px;
    font-size: 16px;
    font-weight: 100;
}

.feiyiItem_bg .bg_bottom {
    position: absolute;
    z-index: -2;
    left: 0px;
    bottom: 0px;
    background-image: url(../../assets/nong_bg2.png);
    width: 100%;
    height: 395px;
    opacity: 1;
    background-size: 100%;
    background-repeat: no-repeat;
}

.kepu_info {
    float: right;
    margin: 30px 10px;
    width: 550px;
    height: max-content;
}

.kepu_info h2 {
    color: #024b3c;
}

.comment_info {
    margin: 20px 0;
    padding-bottom: 5px;
    border-bottom: 1px solid #d9d9d9;
}

.comment_info h2 {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 14px;
}

.comment_info img {
    width: 50px;
    height: 50px;
    border-radius: 50px;
    object-fit: contain;
    border: 1px solid #024b3c;
}

.comment_right {
    display: inline-block;
    position: absolute;
    margin: 0px 10px;
}

.panel {
    position: relative;
    height: 300px;
    padding: 2px;
    margin: 20px 5px;
    border: 1px solid rgba(25, 186, 139, 0.17);
}

.panel::before {
    position: absolute;
    top: 0;
    left: 0;
    width: 10px;
    height: 10px;
    border-left: 2px solid #02a6b5;
    border-top: 2px solid #02a6b5;
    content: "";
}

.panel::after {
    position: absolute;
    top: 0;
    right: 0;
    width: 10px;
    height: 10px;
    border-right: 2px solid #02a6b5;
    border-top: 2px solid #02a6b5;
    content: "";
}

.panel-footer {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
}

.panel-footer::before {
    position: absolute;
    left: 0;
    bottom: 0;
    width: 10px;
    height: 10px;
    border-left: 2px solid #02a6b5;
    border-bottom: 2px solid #02a6b5;
    content: "";
}

.panel-footer::after {
    position: absolute;
    right: 0;
    bottom: 0;
    width: 10px;
    height: 10px;
    border-right: 2px solid #02a6b5;
    border-bottom: 2px solid #02a6b5;
    content: "";
}

.panel h2 {
    height: 0.6rem;
    color: #08544c;
    line-height: 0.6rem;
    text-align: center;
    font-size: 0.25rem;
    font-weight: 400;
}

.panel h2 a {
    color: #08544c;
    text-decoration: none;
    margin: 0 0.125rem;
}

.panel .chart {
    height: 250px;
}
</style>

