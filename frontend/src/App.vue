<template>
  <div id="app">
    <header>
      <div class="menuWrap">
        <ul class="menu">
          <li><a href="/insert">게시판 등록</a></li>
          <li><router-link to="/">게시판 조회</router-link></li>
        </ul>
      </div>
    </header>
    <img alt="Vue logo" src="./assets/logo.png">
    <SelectBoard msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
import SelectBoard from './components/SelectBoard.vue'

export default {
  name: 'App',
  components: {
    SelectBoard
  }
}


</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
html,body{padding:0; margin:0;}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
h1{color:#43b984;}
table{width:100%; border-collapse:collapse;}
.wrap{width:100%;}
.container{width:800px; margin:0 auto;}
a{text-decoration:none;}
.btn{padding:10px; background:#34445c; color:#fff;}
</style>