<template>
  <div id="itDamage">
    <table class="table table-striped table-bordered" id="dataTable">
      <tbody>
        <tr v-for="data in dataList" v-bind:key="data">
          <td class="genre">{{data.class1}}</td>
          <td class="genre">{{data.co_gb}}</td>
          <td class="genre">{{data.rteam}}</td>
          <td class="genre">{{data.rname}}</td>
          <td class="longlen">
            <a v-bind:href="data.rtel">{{data.rtel}}</a>
          </td>
          <td class="longlen">{{data.rtxt}}</td>
          <td class="genre">
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
              @click="enditdamage(data)"
            >완료</button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import itDamageService from "../../service/general/itDamageService";

export default {
  name: "itDamage",
  data() {
    return {
      ctime: "",
      rtime: "",
      datepicker: new Date(),
      querydate: "",
      dataList: []
    };
  },
  methods: {
    getData() {
      itDamageService
        .retrieveItDamage()
        .then(response => {
          this.dataList = response.data;
          console.log(response);
        })
        .catch(e => {
          console.log(e);
        });
    },
    enditdamage(data) {
      itDamageService
        .updateItDamage(data)
        .then(() => {
          this.getData();
        })
        .catch(e => {
          console.log(e);
        });
    },
    fileDown(data) {
      // itDamageService.fileDown(encodeURI(data.attach));      
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
