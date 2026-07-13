<template>
  <div>
    <div class="lunbo">
      <el-carousel height="470px" :interval="5000">
        <el-carousel-item height="470px" v-for="item in imgs" :key="item" style="z-index: -2;">
          <img :src="item" alt="" style="width: 100%; height: 100%;" />
        </el-carousel-item>
        <div class="lun_bottom"> </div>
        <div class="lun_left"> </div>
        <div class="lun_right"> </div>
        <!-- <div class="lun_zhe"> </div> -->
      </el-carousel>
    </div>


    <div class="box">
      <el-tabs class="show" v-model="activeName_huapian" @tab-click="handleClick_huapian">
        <el-tab-pane label="乡村画片" name="first_huapian">
          <el-row :gutter="30">
            <el-col v-for="(item, index) in huapianList" :key="index" :span="8">
              <a href="#">
                <div class="show-content">
                  <img :src="require('../../assets/' + item.image)" style="object-fit: cover; object-position: top;" />
                  <h2>{{ item.name }}</h2>
                  <p>{{ item.intro }}</p>
                </div>
              </a>
            </el-col>
          </el-row>
        </el-tab-pane>
        <el-tab-pane label="河南" name="second_feiyi" @click="handleClick('河南')">
          <el-row :gutter="30">
            <el-col v-for="item in provinList" :key="item" :span="8">
              <router-link
                :to="{ name: 'feiyiItem', params: { name: item.name, location: item.location, intro: item.intro, image: item.image } }">
                <div class="show-content">
                  <img :src="require('@/assets/' + item.image)" />
                  <h2>{{ item.name }}</h2>
                  <p>{{ item.location }}</p>
                </div>
              </router-link>
            </el-col>
          </el-row>
        </el-tab-pane>
        <el-tab-pane label="四川" name="third_huapian"></el-tab-pane>
        <el-tab-pane label="宁夏" name="fourth_huapian"></el-tab-pane>
      </el-tabs>
      <div class="panel radar">
        <h2>各类画片数量</h2>
        <div class="chart">图表</div>
        <div class="panel-footer"></div>
      </div>
    </div>
    <div class="box">
      <el-tabs class="show" v-model="activeName_feiyi" @tab-click="handleClick_feiyi">
        <el-tab-pane label="非遗文化" name="first_feiyi">
          <el-row :gutter="30">
            <el-col v-for="item in feiyiList" :key="item" :span="8">
              <!-- <router-link :to="{ name: 'feiyiItem', params: { name: item.name } }"> -->
              <router-link
                :to="{ name: 'feiyiItem', params: { name: item.name, location: item.location, intro: item.intro, image: item.image } }">
                <div class="show-content">
                  <img :src="require('../../assets/' + item.image)" style="object-fit: cover; object-position: top;" />
                  <h2>{{ item.name }}</h2>
                  <p>{{ item.location }}</p>
                </div>
              </router-link>
            </el-col>
          </el-row>
        </el-tab-pane>

        <el-tab-pane label="贵州" name="second_feiyi" @click="handleClick('贵州')">
          <el-row :gutter="30">
            <el-col v-for="item in provinList" :key="item" :span="8">
              <router-link
                :to="{ name: 'feiyiItem', params: { name: item.name, location: item.location, intro: item.intro, image: item.image } }">
                <div class="show-content">
                  <img :src="item.image" style="object-fit: cover; object-position: top;" />
                  <!-- <img :src="require('@/assets/' + item.image)"/> -->
                  <h2>{{ item.name }}</h2>
                  <p>{{ item.location }}</p>
                </div>
              </router-link>
            </el-col>
          </el-row>
        </el-tab-pane>

        <el-tab-pane label="四川" name="third_feiyi"></el-tab-pane>
        <el-tab-pane label="宁夏" name="fourth_feiyi"></el-tab-pane>
      </el-tabs>
      <div class="panel pie2">
        <h2>国家级非遗各类数值</h2>
        <div class="chart">图表</div>
        <div class="panel-footer"></div>
      </div>
    </div>

    <div class="box">
      <el-tabs class="show" v-model="activeName_nong" @tab-click="handleClick_nong">
        <el-tab-pane label="农特产" name="first_nong">
          <el-row :gutter="30">
            <el-col v-for="(item, index) in nongList" :key="index" :span="8">
              <router-link
                :to="{ name: 'nongItem', params: { name: item.name, location: item.location, intro: item.intro, image: item.image, buy_link: item.link } }">
                <div class="show-content">
                  <img :src="require('../../assets/' + item.image)" style="object-fit: cover; object-position: top;" />
                  <h2>{{ item.name }}</h2>
                  <p>{{ item.location }}</p>
                </div>
              </router-link>
            </el-col>
          </el-row>
        </el-tab-pane>
        <el-tab-pane label="河南" name="second_nong">
          <el-row :gutter="30">
            <el-col :span="6">
              <a href="#">
                <div class="show-content">
                  <img src="../../images/show1-1-1.jpg" />
                  <h2>河南省什么市什么县</h2>
                  <p> 这里的非遗真是棒</p>
                </div>
              </a>
            </el-col>
          </el-row>
        </el-tab-pane>
        <el-tab-pane label="四川" name="third_nong"></el-tab-pane>
        <el-tab-pane label="宁夏" name="fourth_nong"></el-tab-pane>
      </el-tabs>
      <div class="panel bar">
        <h2>“全国名特优新农产品”名录品类分布</h2>
        <div class="chart">图表</div>
        <div class="panel-footer"></div>
      </div>
    </div>

  </div>
</template>

<script>

import request from "@/utils/request";
import huapiandata from '@/assets/huapian.json'
import feyidata from '@/assets/feiyi.json'
import nongdata from '@/assets/nong.json'

import * as echarts from 'echarts'
import '../../js/flexible'

export default {
  name: "FrontHome",
  data() {
    return {
      huapianList: huapiandata.data,
      feiyiList: feyidata.data,
      nongList: nongdata.data,
      provinList: [],
      imgs: [
        require('../../images/lun_huapian.png'),
        require('../../images/lun_feiyi.png'),
        require('../../images/lun_nong.png'),
        require('../../images/lun_zaiqing.png'),
      ],
      activeName_huapian: 'first_huapian',
      activeName_feiyi: 'first_feiyi',
      activeName_nong: 'first_nong',
      activeName_xihuan: 'first_xihuan',
    }
  },
  mounted() {
    //雷达
    (function () {
      var myChart = echarts.init(document.querySelector(".radar .chart"));
      var option = {
        tooltip: {
          
        },
        radar: {
          // shape: 'circle',
          indicator: [
            { name: '自然风光类', max: 400 },
            { name: '传统技艺类', max: 400 },
            { name: '人文建筑类', max: 400 },
            { name: '文化生活类', max: 400 },
            { name: '农特产品类', max: 400 },
          ],
          radius: 115,
        },
        series: [
          {
            name: '各类画片数量',
            type: 'radar',
            data: [
              {
                value: [280, 320, 110, 200, 90],
                name: '',
                areaStyle: {
                  color: new echarts.graphic.RadialGradient(0.1, 0.6, 1, [
                    {
                      color: 'rgba(118, 209, 242, 1)',
                      offset: 0
                    },
                    {
                      color: 'rgba(118, 209, 242, .1)',
                      offset: 1
                    }
                  ])
                }
              }
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
        color: ['#006cff', '#60cda0', '#ed8884', '#ff9f7f', '#0096ff', '#9fe6b8', '#32c5e9', '#1d9dff'],
        legend: {
          left: 'center',
          bottom: '10px',
          itemHeight: 10,
          itemWidth: 10,
          textStyle: {
            color: "08544c",
            fontSize: 9
          }
        },
        tooltip: {
          trigger: "item",
          formatter: "{b}: {c} ({d}%)"
        },
        series: [
          {
            name: '地区分布',
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
              { value: 629, name: '传统技艺' },
              { value: 492, name: '民俗' },
              { value: 473, name: '传统戏剧' },
              { value: 431, name: '传统音乐' },
              { value: 417, name: '传统美术' },
              { value: 356, name: '传统舞蹈' },
              { value: 251, name: '民间文学' },
              { value: 213, name: '传统曲艺' },
              { value: 182, name: '传统医药' },
              { value: 166, name: '传统体育、游艺与杂技' },

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
      var myChart = echarts.init(document.querySelector(".bar .chart"));
      var timer = null;
      myChart.clear();
      clearInterval(timer);
      var SData = [733, 464, 357, 330, 63, 59, 54, 45, 31, 20, 19, 17, 14, 5, 5, 2, 2];
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
            endValue: 7
          }
        ],
        grid: {
          left: '2%',
          top: "10px",
          right: '2%',
          bottom: '0%',
          containLabel: true
        },
        xAxis: [
          {
            type: 'category',
            data: ["水果", "蔬菜", "茶产业", "粮食", "薯类", "中药材", "坚果干果", "畜禽", "豆类", "油类", "食用菌", "水产", "禽蛋", "花卉", "乳业", "蜂产品", "调味品"],
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
              show: true
            }
          },
        ],
        series: [
          {
            name: '共有',
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
          option.dataZoom[0].endValue = 4;
          option.dataZoom[0].startValue = 0;
        }
        else {
          option.dataZoom[0].endValue = option.dataZoom[0].endValue + 1;
          option.dataZoom[0].startValue = option.dataZoom[0].startValue + 1;
        }
        myChart.setOption(option, true);
      }, 4000);



      myChart.clear();
      myChart.setOption(option, true);
      window.addEventListener('resize', function () {
        myChart.resize();
      });
    })();
  },
  created() {
    // this.load_feiyi()
    // this.load_huapian()
    // this.load_nong()
  },
  methods: {
    handleClick(addre) {
      this.provinList = []
      for (let item of feyidata.data) {
        if (item.location.includes(addre)) {
          this.provinList.push(item)
        }
      }
    },
    handleClick_huapian(tab, event) {
      console.log(tab, event);
    },
    handleClick_feiyi(tab, event) {
      console.log(tab, event);
    },
    handleClick_nong(tab, event) {
      console.log(tab, event);
    }
    //查询预备

    // load_feiyi() {
    //   request.get("/feiyi.json").then(res => {
    //     console.log(res)
    //     this.feiyiList = res.data
    //     // this.tableData = res.records
    //     // this.total = res.total
    //   })
    // },
    // load_huapian() {
    //   request.get("http://localhost:8080/user/page?pageNum="+this.pageNum+"&pageSize="+this.pageSize+"&username="+this.username).then(res => {
    //     console.log(res)
    //     // this.tableData = res.records
    //     // this.total = res.total
    //   })
    // },
    // load_nong() {
    //   request.get("http://localhost:8080/user/page?pageNum="+this.pageNum+"&pageSize="+this.pageSize+"&username="+this.username).then(res => {
    //     console.log(res)
    //     // this.tableData = res.records
    //     // this.total = res.total
    //   })
    // },
  }
}
</script>

<style>
.lunbo {
  position: relative;
  top: 0px;
  left: 0;
  width: 100%;
  height: 470px;
}

.lunbo .el-carousel {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
}

.lunbo .lun_left {
  position: absolute;
  top: 0;
  left: 0px;
  width: 180px;
  height: 470px;
  background-image: linear-gradient(to right, #EDF5F5 10px, transparent);
}

.lunbo .lun_right {
  position: absolute;
  top: 0px;
  right: 0px;
  width: 180px;
  height: 470px;
  background-image: linear-gradient(to left, #EDF5F5 10px, transparent);
}

.lunbo .lun_bottom {
  position: absolute;
  bottom: 0px;
  width: 100%;
  height: 50px;
  background-image: linear-gradient(to top, #EDF5F5, transparent);
}

.lunbo .lun_zhe {
  position: absolute;
  bottom: 0px;
  width: 100%;
  height: 100%;
  background-image: radial-gradient(transparent 40%, #EDF5F5);
}

.lunbo .el-carousel .el-carousel__indicators {
  bottom: 5%;
}

.lunbo .el-carousel .el-carousel__arrow {
  margin: 0 30px;
}

.box {
  position: relative;
  width: 1200px;
  margin: 0 0 0 120px;
}

.box .show {
  width: 810px;
}

.box .el-tabs {
  margin-top: 20px;
}

.box .show #tab-first_huapian {
  font-size: 24px;
  font-weight: 700;
}

.box .show #tab-first_feiyi {
  font-size: 24px;
  font-weight: 700;
}

.box .show #tab-first_nong {
  font-size: 24px;
  font-weight: 700;
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
  height: 200px;
}

.box .show .show-content img {
  border-radius: 5px;
  width: 260px;
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

.panel {
  position: absolute;
  top: 37px;
  right: 0;
  height: 430px;
  width: 370px;
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
  height: 380px;
}
</style>
