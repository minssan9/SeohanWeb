<template>
  <div id="report">
    <router-link to="/general/report/new" exact>New Post</router-link>

    <table class="table table-striped table-bordered" id="dataTable">
      <tbody>
        <tr v-for="data in dataList" v-bind:key="data.rtime">
          <td class="d-none d-sm-block">{{data.class1}}</td>
          <td class="d-none d-sm-block">{{data.co_gb}}</td>
          <td class="d-none d-sm-block">{{data.rteam}}</td>
          <td class="d-none d-sm-block">{{data.rname}}</td>
          <td class="">
            <a v-bind:href="data.rtel">{{data.rtel}}</a>
          </td>
          <td class="">{{data.rtxt}}</td>
          <td class="">
            <button
              v-show="data.attach"
              class="btn btn-default btn-sm"
              type="button"
              @click="fileDown(data)"
            >다운로드</button>
          </td>
          <td class="genre">
            <button
              class="btn btn-default btn-sm"
              type="button"
              id="endDamage"
              @click="endreport(data)"
            >완료</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import reportService from "../../../service/general/reportService";

export default {
  name: "report",
  data() {
    return { 
      stat: "",
      datepicker: new Date(), 
      dataList: []
    };
  },
  watch:{
    '$route':'getData'
  },
  methods: {
    getData() {
      var stat = "1";
      reportService
        .retrieveList(stat)
        .then(response => {
          this.dataList = response.data;
          console.log(response);
        })
        .catch(e => {
          console.log(e);
        });
    },
    endreport(data) {
      reportService
        .update(data)
        .then(() => {
          this.getData();
        })
        .catch(e => {
          console.log(e);
        });
    },
    fileDown(data) { 
      window.open("/api/file/" + data.attach);
    }
  },
  created() {
    this.getData();
  },
  mounted: function() {}
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
