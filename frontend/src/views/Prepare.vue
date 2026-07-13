<template>

    <div class="wrapper">
        <div class="bg"></div>
        <div class="header w">
            <div class="logo"></div>
            <div class="name font_fzqkbysjt">乡画 —— 用数据演绎美好乡村</div>
        </div>
        <full-page :options="options" ref="fullpage">
            <div class="section">
                <div style="margin-top: 100px; margin-left: 200px;">
                    <div class="chart chart_loading" style="left: 170px; width: 200px;"></div>
                    <div class="chart chart_name" style="width: 550px;"></div>

                    <router-link :to="{ name: 'huapianMain' }" style="position: absolute; left: 230px; top: 200px;">
                        <el-button class="primary-btn">乡村画片</el-button>
                    </router-link>

                    <router-link :to="{ name: 'FrontHome' }" style="position: absolute; left: 400px; top: 200px;">
                        <el-button class="primary-btn">乡画商城</el-button>
                    </router-link>

                </div>

                <div class="logo_big w"></div>
            </div>

            <div class="section">
                <div class="font_fzqkbysjt" style="margin: 40px auto; width: 200px; font-size: 34px; text-align: center;">
                    四大特点
                </div>
                <div style="margin: 0px auto; width: 1310px; height: 800px;">
                    <div style="float: left;">
                        <img class="feature" src="../assets/prepare_feature_1.png">
                    </div>
                    <div style="float: left; margin-right: 10px;">
                        <img class="feature" src="../assets/prepare_feature_2.png">
                    </div>
                    <div style="float: left;">
                        <img class="feature" src="../assets/prepare_feature_3.png">
                    </div>
                    <div style="float: left;">
                        <img class="feature" src="../assets/prepare_feature_4.png">
                    </div>
                </div>
            </div>

            <div class="section">
                <img src="../assets/prepare_contact_us.png" style="margin: 0 220px; width: 1100px; height: 450px">
            </div>
        </full-page>
    </div>

</template>
  
<script>
import * as echarts from 'echarts'
import "../fonts/FZQKBYSJW.css";

export default {
    name: "Prepare",
    data() {
        return {
            options: {
                navigation: true,
            },
        }
    },

    mounted() {
        (function () {
            var myChart = echarts.init(document.querySelector(".chart_loading"));
            var option = {
                graphic: {
                    elements: [
                        {
                            type: 'group',
                            left: 'center',
                            top: 'center',
                            children: new Array(7).fill(0).map((val, i) => ({
                                type: 'rect',
                                x: i * 20,
                                shape: {
                                    x: 0,
                                    y: -40,
                                    width: 10,
                                    height: 80
                                },
                                style: {
                                    fill: '#34bca3'
                                },
                                keyframeAnimation: {
                                    duration: 1000,
                                    delay: i * 200,
                                    loop: true,
                                    keyframes: [
                                        {
                                            percent: 0.5,
                                            scaleY: 0.3,
                                            easing: 'cubicIn'
                                        },
                                        {
                                            percent: 1,
                                            scaleY: 1,
                                            easing: 'cubicOut'
                                        }
                                    ]
                                }
                            }))
                        }
                    ]
                }
            };
            myChart.setOption(option, true);
            window.addEventListener('resize', function () {
                myChart.resize();
            });
        })();

        (function () {
            var myChart = echarts.init(document.querySelector(".chart_name"));
            var option = {
                graphic: {
                    elements: [
                        {
                            type: 'text',
                            left: 'center',
                            top: 'center',
                            style: {
                                text: '乡画 XiangHua',
                                fontSize: 80,
                                fontWeight: 'bold',
                                lineDash: [0, 200],
                                lineDashOffset: 0,
                                fill: 'transparent',
                                stroke: '#08544c',
                                lineWidth: 1
                            },
                            keyframeAnimation: {
                                duration: 3000,
                                loop: false,
                                keyframes: [
                                    {
                                        percent: 0.7,
                                        style: {
                                            fill: 'transparent',
                                            lineDashOffset: 200,
                                            lineDash: [200, 0]
                                        }
                                    },
                                    {
                                        // Stop for a while.
                                        percent: 0.8,
                                        style: {
                                            fill: 'transparent'
                                        }
                                    },
                                    {
                                        percent: 1,
                                        style: {
                                            fill: '#08544c'
                                        }
                                    }
                                ]
                            }
                        }
                    ]
                }
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
body {
    margin: 0;
    padding: 0;
}

.w {
    width: 1210px;
    margin: auto;
}

.header {
    height: 30px;
    margin: 0px auto;
    margin-top: 30px;
}

.name {
    float: left;
    font-size: 25px;
    line-height: 30px;
}

.wrapper {
    position: relative;
    height: 100vh;
    background-image: linear-gradient(to bottom right, #C8E5DA, #EDF5F5);
    background-size: 100%;
    overflow: hidden;
}

.bg {
    position: absolute;
    left: 0%;
    bottom: 0%;
    width: 1630px;
    height: 595px;
    background-image: url(../assets/bg.png);
    opacity: 0.6;
    background-size: 100%;
    background-repeat: no-repeat;
}

.logo {
    float: left;
    width: 60px;
    height: 60px;
    margin-top: -16px;
    background-image: url(../assets/logo.png);
    background-repeat: no-repeat;
    background-position-x: center;
    background-size: 240%;
}

.chart {
    float: left;
    height: 200px;
}

.logo_big {
    position: absolute;
    right: 180px;
    top: -30px;
    width: 300px;
    height: 300px;
    background-image: url(../assets/logo.png);
    background-repeat: no-repeat;
    background-position-x: center;
    background-size: 280%;
}

.primary-btn {
    z-index: 100;
    display: block;
    position: relative;
    left: 10px;
    width: 150px;
    height: 40px;
    border-radius: 20px;
    margin-top: 0px;
    text-align: center;
    font-size: 14px;
    letter-spacing: 2px;
    background-color: #34bca3;
    color: #f9f9f9;
    cursor: pointer;
    box-shadow: 8px 8px 16px #d1d9e6, -5px -5px 10px #f9f9f9;
}

.primary-btn:hover {
    box-shadow: 2px 2px 6px 0 rgba(255, 255, 255, 0.6),
        -2px -2px 6px 0 rgba(116, 125, 136, 0.5),
        inset -4px -4px 3px 0 rgba(255, 255, 255, 0.2),
        inset 4px 4px 3px 0 rgba(0, 0, 0, 0.4);
}

.feature {
    width: 95%;
    height: 450px;
}

.feature:hover {
    transition: transform 0.5s ease-out;
    transform: translate(0px, -30px);
}

.font_fzqkbysjt {
    font-family: fzqkbysjt;
}
</style>
  