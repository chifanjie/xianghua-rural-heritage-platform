module.exports = {
    configureWebpack: {},
    devServer: { // 环境配置
      host: '127.0.0.1',
      public: '127.0.0.1:8081', // 默认仅用于本机开发
      port: '8081',
      https: false,
      disableHostCheck: false,
      open: false // 配置自动启动浏览器
    }
}
