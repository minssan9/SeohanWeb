<template>
  <div id="report">
    등록
  </div>
</template>

<script>
import reportService from "../../../service/general/reportService";

export default {
  name: "report",
  data() {
    return {
      stat: "1",
      dataList: []
    };
  },
  methods: {
    getData() {
      reportService
        .retrieve(stat)
        .then(response => {
          this.dataList = response.data;
          console.log(response);
        })
        .catch(e => {
          console.log(e);
        });
    },
    save(data) {
      reportService
        .save(data)
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
