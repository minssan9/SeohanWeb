<template>
  <div class="container" id="app">
    <div class="row panel panel-default panel-body">
      <div>
        <h3>식단표</h3>
        <input
          v-model="datepicker"
          v-on:change="getData"
          type="date"
          value="datepicker && datepicker.toISOString().split('T')[0]"
        />
      </div>
      <table class="table table-striped table-bordered">
        <thead>
          <th class>구분</th>
          <th class>메뉴</th>
        </thead>
        <tbody>
          <tr v-for="data in dataList" v-bind:key="data">
            <td :rowspan="rowspanSettings[index]" v-if="rowspanSettings[index] > 0">{{data.gubn}}</td>
            <td>{{data.menu}}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import foodTableService from "@/service/general/foodTableService";

export default {
  name: "foodTable",
  data() {
    return {
      datepicker: new Date(),
      querydate: "",
      dataList: []
    };
  },
  methods: {
    getData() {
      this.querydate =
        this.datepicker.substr(0, 4) +
        this.datepicker.substr(5, 2) +
        this.datepicker.substr(8, 2);
      foodTableService
        .retrieveFoodTable(this.querydate)
        .then(response => {
          // response.data.forEach(data => {
            response.data.forEach(function(item){
            switch (item.gubn){
              case'A':item.gubn='아침';break;
              case'B':item.gubn='점심';break;
              case'C':item.gubn='저녁';break;
              case'D':item.gubn='야식';break;
            }
          });

          this.dataList = response.data;
        })
        .catch(e => {
          console.error(e);
        });
    }
  },
  created() {
    var today = new Date();
    this.datepicker =
      today.getFullYear() +
      "-" +
      ("00" + (today.getMonth() + 1)).slice(-2) +
      "-" +
      ("00" + (today.getDate())).slice(-2);
    this.getData();
  },
  mounted: function() {},
  computed: {
  }
};
</script>

