<template>
  <!--    头部-->
  <div>
    <div class="header_bg">
      <div class="header w">
        <div class="logo"></div>
        <router-link :to="{ name: 'Prepare' }">
          <div class="name font_fzqkbysjt">乡画 —— 用数据演绎美好乡村</div>
        </router-link>
        
        <div class="search">
          <el-input placeholder="请输入内容" prefix-icon="el-icon-search" v-model="search_input">
          </el-input>
          <!-- <el-button>默认按钮</el-button> -->
        </div>
        <div class="nav">
          <el-menu :default-active="1" class="el-menu-demo" mode="horizontal" router>
            <el-menu-item class="item_li" index="/front/huapianMain">乡村画片</el-menu-item>
            <el-menu-item class="item_li" index="/front/home">乡画商城</el-menu-item>
            <!-- <el-submenu  index="2">
            <template slot="title">乡村画片</template>
            <el-menu-item index="/front/item1">选项1</el-menu-item>
            <el-menu-item index="2-2">选项2</el-menu-item>
            <el-menu-item index="2-3">选项3</el-menu-item>
            <el-submenu index="2-4">
              <template slot="title">选项4</template>
              <el-menu-item index="2-4-1">选项1</el-menu-item>
              <el-menu-item index="2-4-2">选项2</el-menu-item>
              <el-menu-item index="2-4-3">选项3</el-menu-item>
            </el-submenu>
          </el-submenu>  -->
            <el-menu-item class="item_li" index="/front/feiyiMain">非遗文化</el-menu-item>
            <el-menu-item class="item_li" index="/front/nongMain">农产品</el-menu-item>
            <el-menu-item v-if="!user.username" class="item_li" index="/login" style="margin-right: 0;">我的</el-menu-item>
            <el-menu-item v-else class="item_li" index="/login" style="margin-right: 0;">我的</el-menu-item>
          </el-menu>
        </div>
      </div>
    </div>
    <div style="width: 100%; margin: 0 auto">
      <router-view />
    </div>
  </div>
</template>

<script>
import request from "@/utils/request";
import "../../fonts/FZQKBYSJW.css";

export default {
  name: "Front",
  data() {
    return {
      user: localStorage.getItem("user") ? JSON.parse(localStorage.getItem("user")) : {},
      search_input: "",
    }
  },

  created() {

  },
  methods: {
    logout() {
      this.$store.commit("logout")
      this.$message.success("退出成功")
    }
  }
}
</script>

<style>
body {
  margin: 0;
  padding: 0;
  background-color: #EDF5F5;
  /* background-image: linear-gradient(to bottom right, #C8E5DA, #EDF5F5); */
}

.w {
  width: 1200px;
  margin: auto;
}

.header_bg {
  position: fixed;
  top: 0;
  width: 100%;
  height: 70px;
  background-image: linear-gradient(to bottom, #C8E5DA 25%, rgba(237, 245, 245, 0.1));
  z-index: 99;
}

.header {
  top: 0;
  width: 1210px;
  margin: 0px auto;
  padding: 20px 0;
  height: 30px;
  z-index: 100;
}

.logo {
  float: left;
  width: 60px;
  height: 60px;
  margin-top: -16px;
  background-image: url(/img/logo.a1082bd6.png);
  background-repeat: no-repeat;
  background-position-x: center;
  background-size: 240%;
}

.name {
  float: left;
  font-size: 25px;
  line-height: 30px;
  margin-right: 50px;
  color: #000;
}

.search {
  display: inline-block;
  width: 250px;
}

.search .el-input__inner {
  background-color: transparent;
  height: 30px;
  color: #08544c;
  border: 1px solid #b4dacc;
  border-radius: 15px;
}

.search .el-input__inner::placeholder {
  color: #777777;
  font-weight: 200;
}

.search .el-input__prefix {
  color: #878787;
  font-weight: 200;
}

.nav {
  float: right;
}

.nav .el-menu-demo {
  background-color: transparent;
  height: 30px;
  border: 0;
}

.nav .el-menu-demo .item_li {
  height: 30px;
  line-height: 30px;
  padding: 0 10px;
  margin: 0 10px;
  font-size: 18px;
  color: #343434;
}

.nav .el-menu-demo .item_li:hover {
  border-bottom: 2px solid #34bca3 !important;
  color: #34bca3;
  background-color: transparent;
}

.nav .el-menu-demo .item_li.is-active {
  border-bottom: 0;
  color: #343434;
  background-color: transparent;
}

.nav .el-menu-demo .item_li:focus {
  background-color: transparent;
}

.nav .el-menu-demo .el-submenu {
  height: 30px;
  line-height: 30px;
}

.nav .el-menu-demo .el-submenu .el-submenu__title {
  height: 30px;
  line-height: 30px;
  padding: 0 10px;
  margin: 0 15px;
  font-size: 18px;
  color: #343434;
}

.nav .el-menu-demo .el-submenu .el-submenu__title:hover {
  border-bottom: 2px solid #34bca3 !important;
  color: #34bca3;
  background-color: transparent;
}

.font_fzqkbysjt{
	font-family: fzqkbysjt;
} 
</style>
