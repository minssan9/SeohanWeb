<template>
  <div class="container" id="app">
    <div class="row panel panel-default panel-body">
      <h3>식단표</h3>
      <input
        v-model="datepicker"
        v-on:change="getData"
        type="date"
        value="datepicker && datepicker.toISOString().split('T')[0]"
      />

      <table class="table table-striped table-bordered">
        <thead>
          <th class>구분</th>
          <th class>메뉴</th>
        </thead>
        <tbody>
          <tr v-for="data in dataList" v-bind:key="data">
            <td class="" v-if="data.gubn==='A'">아침</td>
            <td class="" v-else-if="data.gubn==='B'">점심</td>
            <td class="" v-else-if="data.gubn==='C'">저녁</td>
            <td class="" v-else-if="data.gubn==='D'">야식</td>
            <td>{{data.menu}}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import foodTableService from "../../service/general/foodTableService";

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
        .retrieveFoodTableKamtec(this.querydate)
        .then(response => {
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
      ("00" + today.getDate()).slice(-2);
    this.getData();
  },
  mounted: function() {},
};
</script>