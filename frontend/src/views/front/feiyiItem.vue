<template>
    <div class="feiyiItem_body">
        <div class="bg_right"></div>

        <div class="info">
            <div class="font_fzqkbysjt name">
                <p></p>
                <!-- {{ this.name }} -->
                景德镇手工制瓷技艺
            </div>
            <div class="font_fzqkbysjt address">
                <!-- {{ this.location }} -->
                江西省景德镇市
            </div>
            <el-rate v-model="value" disabled show-score text-color="#ff9900" score-template="{value}">
            </el-rate>
        </div>
        <div class="img_info">
            <video controls preload width="780px" height="400px"
                data-setup="{}">
                <source src="../../video/3d_1.mp4" />
            </video>
        </div>

        <div class="buy">
            <div class="panel line2">
                <h2>景德镇瓷器价格指数走势</h2>
                <div class="chart">图表</div>
                <div class="panel-footer"></div>
            </div>

            <a href="https://detail.tmall.com/item.htm?abbucket=0&id=676460255545&ns=1&spm=a21n57.1.0.0.1cf2523c8Eyd36" target="https://detail.tmall.com/item.htm?abbucket=0&id=676460255545&ns=1&spm=a21n57.1.0.0.1cf2523c8Eyd36">
                <el-button class="buy_button" icon="el-icon-s-goods">立即购买</el-button>
            </a>
        </div>

        <div class="font_fzqkbysjt details">
            <p style="font-size: 25px; color: #000; margin: 20px 0 5px 0;">介绍</p>
            <p style="line-height: 1.5;">
                <!-- {{ this.intro }} -->
                景德镇手工制瓷技艺中重要的成型工序在宋代已初步建立。瓷业内部分工日益细化，普遍采用拉坯、印坯、利坯、修足、蘸釉、荡釉等技艺制作瓷坯，再采用匣钵仰烧、垫钵覆烧、支圈覆烧等技法进行装烧。到元代，又发明了瓷石加高岭土的“二元配方法”及青花釉下彩绘技术。明、清两代，景德镇制瓷业进一步发展，“共计一坯之力，过手七十二，方克成器。其中微细节目，尚不能尽也”，制瓷手工技艺体系基本完善，采矿、淘洗、制不、练泥、陈腐、拉坯、利坯、画坯、施釉、烧窑、画红、烧炉、选瓷、包装等工序环环紧扣，专业化程度日益提高，各方面都有身怀绝技的能工巧匠，景德镇手工制瓷业至此达到了历史的最高峰。景德镇瓷业习俗是景德镇制瓷历史的重要组成部分。景德镇在宋代出现“村村窑火，户户陶埏”的景观，瓷业习俗已具雏形。明、清以后，珠山御厂的设立和海外市场的进一步扩大刺激了景德镇制瓷业的蓬勃发展，致使几乎所有散落在乡村的小窑作坊都集中到城区，形成众多的手工业工场，吸纳了大量从业人员，“窑户与铺户当十之七八，土著十之二三”。
            </p>
            <p style="font-size: 25px; color: #000; margin: 20px 0 5px 0;">科普辨真</p>
            <div class="kepu">
                <!-- <video controls preload width="600px" height="380px" style="margin: 0px 10px;"
                    poster="../../images/video_poster.png" data-setup="{}">
                    <source src="../../video/982823302_1_0.mp4" />
                </video> -->
                <iframe preload width="610px" height="380px" style="margin: 10px;"
                src="//player.bilibili.com/player.html?aid=632211074&bvid=BV1Qb4y1z7ti&cid=386372533&page=1&autoplay=0" scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true"> </iframe>

                <div class="kepu_info">
                    <h2>非遗里的中国纹样——青花瓷</h2>
                    <p style="color: #08544c; font-size: 18px; margin-top: 10px;">作者：纹藏·中国纹样数据库官方平台</p>
                    <p style="line-height: 25px;">
                        介绍：景德镇瓷业习俗是景德镇制瓷历史的重要组成部分。景德镇在宋代出现“村村窑火，户户陶埏”的景观，瓷业习俗已具雏形。明、清以后，珠山御厂的设立和海外市场的进一步扩大刺激了景德镇制瓷业的蓬勃发展，致使几乎所有散落在乡村的小窑作坊都集中到城区，形成众多的手工业工场，吸纳了大量从业人员，“窑户与铺户当十之七八，土著十之二三”。
                    </p>
                </div>
            </div>

            <p style="font-size: 25px; color: #000; margin: 20px 0 5px 0;">您的评分</p>
            <el-rate v-model="pingfen" show-text></el-rate>
        </div>

        <div class="font_fzqkbysjt pinglun">
            <p style="font-size: 25px; color: #000; margin: 20px 0 5px 0;">评论</p>
            <el-input type="textarea" :autosize="{ minRows: 2, maxRows: 4 }" placeholder="请输入您的评价" v-model="comment">
            </el-input>
            <el-button type="success" plain @click="save_comment" v-model=comment>提交</el-button>
            <div class="comment_info">
                <div style="display: inline-block;">
                    <img
                        src="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202105%2F29%2F20210529001057_aSeLB.thumb.1000_0.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1683382981&t=12291ca903dc1037f53d18d88fca7321">
                    <h2>用户3005</h2>
                </div>
                <div class="comment_right" style="display: inline-block;">
                    <p style="font-size: 10px; font-family:Arial, Helvetica, sans-serif; color: #667; margin: 5px 2px;">
                        2023-03-22 16:47</p>
                    <p>青花瓷绝了！感受到了手艺人的用心，为他们的用心点赞，很高兴能用实际行动支持非遗保护！</p>
                </div>
            </div>

            <div class="comment_info">
                <div style="display: inline-block;">
                    <img src="https://img0.baidu.com/it/u=481566388,3453915038&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500">
                    <h2>用户1021</h2>
                </div>
                <div class="comment_right" style="display: inline-block;">
                    <p style="font-size: 10px; font-family:Arial, Helvetica, sans-serif; color: #667; margin: 5px 2px;">
                        2023-02-11 09:13</p>
                    <p>瓷器很精美，工艺很独特，感谢乡画让我看到了这么独特的非遗产品。</p>
                </div>

            </div>
        </div>
        <div style="width: 100%; height: 250px;"></div>
        <div class="feiyiItem_bg" style="position: relative; left: -11%;  width: 125%;">
            <div class="bg_bottom"></div>
        </div>
    </div>
</template>
  
<script>

import request from "@/utils/request";
import "../../fonts/FZQKBYSJW.css";
import * as echarts from 'echarts'
import '../../js/flexible'

import feyidata from '@/assets/feiyi.json'

export default {
    name: "feiyiItem",
    data() {
        return {
            value: 4.9,
            pingfen: null,
            name: "",
            location: "",
            intro: "",
            image: "",
            comment: "",
            itemData: feyidata.data,
        }
    },
    created() {
        // 获取参数并根据参数从后端获取数据
        this.name = this.$route.params.name
        this.location = this.$route.params.location
        this.intro = this.$route.params.intro
        this.image = this.$route.params.image
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
                    data: ['景德镇艺术瓷器价格指数走势', '景德镇生活瓷器价格指数走势'],
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
                        data: ['2021-12-31', '2022-01-31', '2022-02-28', '2022-03-31', '2022-04-30', '2022-05-31', '2022-06-30', '2022-07-31', '2022-08-31', '2022-09-29', '2022-10-31', '2022-11-30', '2022-12-31', '2023-01-31', '2023-02-28'],
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
                        min:99,
                        max:104
                    }
                ],
                series: [
                    {
                        name: '景德镇艺术瓷器价格指数走势',
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
                        data: [100, 100.91729676, 101.00431887, 100.81607337, 101.26779702, 100.72663981, 100.9496615, 99.90396747, 99.96582115, 100.0984595, 102.73123568, 103.17067602, 103.19744838, 103.4563203, 103.31407809]
                    },
                    {
                        name: '景德镇生活瓷器价格指数走势',
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
                        data: [100, 102.94587188, 103.28532703, 101.94600396, 103.46009001, 103.08679992, 102.34782085, 101.97440518, 101.950177, 102.1464784, 103.33504426, 103.49371528, 103.26891428, 103.7459359, 103.48779255]
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
    width: 540px;
    height: 980px;
    background-size: 100%;
    background-repeat: no-repeat;
    background-image: url(../../assets/feiyiItem_bg3.png);
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
    /* background-image: linear-gradient(to bottom right, #C8E5DA, #EDF5F5); */
    background-image: linear-gradient(to bottom right, #C8E5DA, #EDF5F5);;
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

.el-link:hover {
    color: #34bca3;
    border-bottom: 1px solid #34bca3;
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
    height: 550px;
    top: 130px;
    font-size: 16px;
    font-weight: 100;
}

.feiyiItem_bg .bg_bottom {
    position: absolute;
    z-index: -2;
    left: 0px;
    bottom: 0px;
    background-image: url(../../assets/feiyiItem_bg1.png);
    width: 100%;
    height: 362px;
    opacity: 1;
    background-size: 97%;
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
