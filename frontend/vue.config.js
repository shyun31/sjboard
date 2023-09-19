const { defineConfig } = require('@vue/cli-service')

module.exports = {
  outputDir: "../src/main/resources/static",
  devServer: {
    port: 8888,
    proxy: {
      '/api': {
        target: 'http://localhost:8081',
        changeOrigin: true
      }
    }
  }
};