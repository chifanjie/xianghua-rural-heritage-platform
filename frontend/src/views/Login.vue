<template>
  <div class="wrapper">
    <div class="header w">
      <div class="logo"></div>
      <div class="name font_fzqkbysjt">乡画 —— 用数据演绎美好乡村</div>
      <div class="nav">
        <ul>
          <li><router-link to="/front/huapianMain">乡村画片</router-link></li>
          <li><router-link to="/front/home">乡画商城</router-link></li>
          <li><router-link to="/register" style="margin-right: 0;">登录</router-link></li>
        </ul>
      </div>
    </div>

    <div class="slogan"></div>

    <div class="main-box">

      <div :class="['container', 'container-login', { 'is-txl is-z200': isLogin }]">
        <el-form class="form" :model="user" :rules="rules" ref="userForm">

          <h2 class="title">登录</h2>
          <span class="text">助力乡村，你我同行！</span>

          <el-form-item prop="username">
            <el-input placeholder="请输入账号" style="margin-top: 10px; padding-left: 0; width: 320px;" size="medium"
              prefix-icon="el-icon-user" v-model="user.username"></el-input>
          </el-form-item>

          <el-form-item prop="password">
            <el-input placeholder="请输入密码" style="margin-top: 10px; margin-bottom: 20px; padding-left: 0; width: 320px;"
              size="medium" prefix-icon="el-icon-lock" show-password v-model="user.password"></el-input>
          </el-form-item>

          <router-link :to="{ name: 'Prepare' }">
          <el-button class="primary-btn" @click="login">立即登录</el-button>
          </router-link>

        </el-form>
      </div>

      <div :class="['container', 'container-register', { 'is-txl': isLogin }]">
        <el-form class="form" :model="user" :rules="rules" ref="userForm">

          <h2 class="title">注册</h2>
          <span class="text">发现乡村之美，从这里开始！</span>

          <el-form-item prop="usertype">
            <el-select v-model="value" placeholder="请选择身份" style="margin-top: 5px; padding-left: 0; width: 320px;"
              size="medium" @change="handleSelectChange" prefix-icon="el-icon-user">
              <el-option v-for="item in options" :key="item.value" :label="item.label" :value="item.value">
              </el-option>
            </el-select>
          </el-form-item>

          <el-form-item prop="username">
            <el-input placeholder="请输入账号" style="margin-top: 3px; padding-left: 0; width: 320px;" size="medium"
              prefix-icon="el-icon-user" v-model="user.username"></el-input>
          </el-form-item>

          <el-form-item prop="password">
            <el-input placeholder="请输入密码" style="margin-top: 3px; padding-left: 0; width: 320px;" size="medium"
              prefix-icon="el-icon-lock" show-password v-model="user.password"></el-input>
          </el-form-item>

          <el-form-item prop="confirmPassword">
            <el-input placeholder="请确认密码" style="margin-top: 3px; padding-left: 0; width: 320px;" size="medium"
              prefix-icon="el-icon-lock" show-password v-model="user.confirmPassword"></el-input>
          </el-form-item>

          <el-button class="primary-btn" @click="register">立即注册</el-button>

        </el-form>
      </div>

      <div :class="['switch', { login: isLogin }]">
        <div class="switch__circle"></div>
        <div class="switch__circle switch__circle_top"></div>
        <div class="switch__container">
          <h2>{{ isLogin ? '你好新朋友！' : '欢迎回来！' }}</h2>
          <p>
            {{
              isLogin
              ? '没有账号？完善账号信息，乡村之旅起航~'
              : '已有账号？填写账号信息，你我都在路上~'
            }}
          </p>
          <el-button class="primary-btn" @click="isLogin = !isLogin" style="margin-top: 40px">
            {{ isLogin ? '立即注册' : '立即登录' }}
          </el-button>
        </div>
      </div>
    </div>

    <div class="bg"></div>
  </div>
</template>

<script>

import request from "@/utils/request";
import "../fonts/FZQKBYSJW.css";
// import { setRoutes } from "@/router";

export default {
  name: "Login",
  data() {
    return {
      isLogin: true,
      radio: 1,
      options: [{
        value: '1',
        label: '普通用户'
      }, {
        value: '2',
        label: '管理员'
      }],
      value: '',
      user: {},
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' },
          { min: 3, max: 10, message: '长度在 3 到 5 个字符', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' },
          { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
        ],
        confirmPassword: [
          { required: false, message: '请输入密码', trigger: 'blur' },
          { min: 1, max: 20, message: '长度在 1 到 20 个字符', trigger: 'blur' }
        ],
      }
    }
  },
  methods: {
    login() {
      request.post("/user/loginUser", this.user).then(res => {
        if (res.code === '200') {
          if (res.data.role_id === 100) {
            localStorage.setItem("username", JSON.stringify(res.data.username))
            localStorage.setItem("role", JSON.stringify('管理员'))
            this.$router.push("/admin")
            this.$message.success("登录成功")
          }
          else if (res.data.role_id === 200) {
            localStorage.setItem("username", JSON.stringify(res.data.username))
            localStorage.setItem("role", JSON.stringify('用户'))
            this.$router.push("/home")
            this.$message.success("登录成功")
          }
        } else {
          this.$message.error("用户名或密码错误")
        }
      });
    },
    register() {
      if (this.radio === 1) {
        request.post("/user/RegisterClientUser", this.user).then(res => {
          if (res.code === '200') {
            localStorage.setItem("user", JSON.stringify(res.data))
            this.$router.push("/login")
            this.$message.success("用户注册成功")
          } else {
            this.$message.error("注册失败")
          }
        }
        )
      } else if (this.radio === 2) {
        request.post("/user/RegisterAdminUser", this.user).then(res => {
          if (res.code === '200') {
            localStorage.setItem("user", JSON.stringify(res.data))
            this.$router.push("/login")
            this.$message.success("管理员注册成功")
          } else {
            this.$message.error("注册失败")
          }
        })
      }
    },
    handleSelectChange(value) {
      switch (value) {
        case '1':
          this.radio = 1
          console.log(this.radio)
          break;
        case '2':
          this.radio = 2
          console.log(this.radio)
          break;
      }
    }
  }
}
</script>

<style scoped>
body {
  margin: 0;
  padding: 0;
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
  z-index: 0;
  left: 0%;
  bottom: 0%;
  width: 1630px;
  height: 595px;
  background-image: url(../assets/bg.png);
  opacity: 0.6;
  background-size: 100%;
  background-repeat: no-repeat;
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

.name {
  float: left;
  font-size: 25px;
  line-height: 30px;
}

.nav {
  float: right;
  margin-left: 60px;
}

.nav ul li {
  float: left;
  margin: 0 15px;
  list-style: none;
}

.nav ul li a {
  display: inline-block;
  text-decoration: none;
  height: 30px;
  line-height: 30px;
  padding: 0 10px;
  font-size: 18px;
  color: #343434;
}

.nav ul li a:hover {
  border-bottom: 2px solid #34bca3;
  color: #34bca3;
}

.slogan {
  margin: 10px auto;
  margin-bottom: 35px;
  width: 750px;
  height: 150px;
  background-image: url("../assets/slogan.png");
  background-size: 100%;
}

.main-box {
  position: relative;
  margin: 0 auto;
  width: 880px;
  min-width: 880px;
  min-height: 500px;
  height: 500px;
  padding: 20px;
  background-image: linear-gradient(to bottom right, rgba(226, 240, 236, 0, 1), rgba(239, 246, 246, 0.1));
  box-shadow: 6px 6px 6px #bfd5d5, -4px -4px 4px #ddf3f3;
  border-radius: 12px;
  overflow: hidden;
}

.container {
  display: flex;
  justify-content: center;
  align-items: center;
  position: absolute;
  top: 0;
  width: 520px;
  height: 100%;
  padding: 20px;
  background-color: #EDF5F5;
  transition: all 1.25s;
}

.form {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  width: 100%;
  height: 100%;
  color: #a0a5a8;
}

.form .title {
  font-size: 32px;
  font-weight: 700;
  line-height: 2;
  color: #181818;
}

.form .text {
  font-size: 14px;
  margin-top: 18px;
  margin-bottom: 24px;
}

.container-register {
  z-index: 100;
  left: calc(100% - 520px);
}

.container-login {
  left: calc(100% - 520px);
  z-index: 0;
}

.is-txl {
  left: 0;
  transition: 1.25s;
  transform-origin: right;
}

.is-z200 {
  z-index: 200;
  transition: 1.25s;
}

.switch {
  display: flex;
  justify-content: center;
  align-items: center;
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 360px;
  padding: 50px;
  z-index: 200;
  transition: 1.25s;
  background-color: #EDF5F5;
  overflow: hidden;
  box-shadow: 4px 4px 10px #ddf3f3, -4px -4px 10px #ddf3f3;
  color: #a0a5a8;
}

.switch .switch__circle {
  position: absolute;
  width: 240px;
  height: 240px;
  border-radius: 50%;
  background-color: #EDF5F5;
  box-shadow: inset 8px 8px 12px #d1d9e6, inset -8px -8px 12px #f9f9f9;
  left: -20%;
  bottom: -30%;
  transition: 1.25s;
}

.switch .switch__circle_top {
  top: -25%;
  left: 70%;
  width: 200px;
  height: 200px;
}

.switch .switch__container {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  position: absolute;
  width: 360px;
  padding: 50px auto;
  padding-bottom: 55px;
  transition: 1.25s;
}

.switch .switch__container h2 {
  font-size: 30px;
  font-weight: 700;
  line-height: 3;
  color: #181818;
}

.switch .switch__container p {
  margin-top: 10px;
  font-size: 13px;
  letter-spacing: 0.25px;
  text-align: center;
  line-height: 1.6;
}

.login {
  left: calc(100% - 360px);
}

.login .switch__circle {
  left: 0;
}

.primary-btn {
  width: 150px;
  height: 40px;
  border-radius: 20px;
  margin-top: 20px;
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

.font_fzqkbysjt {
  font-family: fzqkbysjt;
}
</style>
