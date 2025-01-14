<template>
    <div class="full-screen">
           <el-container style="height: 100%; border:1px solid #eee;">
               <el-header style="font-size: 40px; background-color: rgb(238, 241, 246)">我的测试系统</el-header>
               <el-container>
                   <el-aside width="230px" style=" border :1px solid #eee" >
                       <el-menu :default-openeds="['1', '2']">
                           <el-submenu index="1">
                               <template slot="title"><i class="el-icon-message"></i>系统信息管理</template>
                               <el-menu-item index="1-1">
                                   <router-link to="/test">部门管理</router-link> 
                               </el-menu-item>
                               <el-menu-item index="1-2">
                                   <router-link to="/emp">人员管理</router-link>   
                               </el-menu-item>
                           </el-submenu>
                       </el-menu>
                   </el-aside>
                   <el-container>
                       <el-main>
                           <el-form :inline="true" :model="userForm" class="demo-form-inline">
                               <el-form-item label="姓名">
                                   <el-input v-model="userForm.name" placeholder="姓名"></el-input>
                               </el-form-item>
                               <el-form-item label="性别">
                                   <el-select v-model="userForm.sex" placeholder="性别">
                                       <el-option label="男" value="1"></el-option>
                                       <el-option label="女" value="0"></el-option>
                                   </el-select>
                               </el-form-item>
                               <el-form-item label="入职日期">
                                   <el-date-picker v-model="userForm.date" type="date" placeholder="选择日期"></el-date-picker>
                               </el-form-item>
                               <el-form-item>
                                   <el-button type="primary" @click="onSubmit">查询</el-button>
                               </el-form-item>
                           </el-form>
                           <el-table :data="tableData" stripe style="width: 100% " >
                             
                               <el-table-column prop="name" label="姓名" width="180"></el-table-column>
      
        
                               <el-table-column label="操作" width="180">
                                   <template #default="scope">
                                       <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                                       <el-button size="mini" type="danger"
                                           @click="handleDelete(scope.$index, scope.row)">删除</el-button>
                                   </template>
                               </el-table-column>
                           </el-table>
                           <br><br>
                           <div class="block">
                               <el-pagination layout="prev, pager, next" :total="tableData.length" :page-size="pageSize"
                                   :current-page="currentPage" @current-change="handlePageChange" ></el-pagination>
                           </div>
                       </el-main>
                   </el-container>
               </el-container>
           </el-container>
       </div>
   </template>
   <script>
   import axios from 'axios';
   export default {
       data() {
           return {
               userForm: {
                   name: '',
                   sex: '',
                   date: ''
               },
               tableData: [],
           
               sourceTable:[],
               dialogTableVisible: false,
               currentPage: 1, // 当前页码
               pageSize: 5 // 每页显示的条目数
   
           }
       },
       mounted() {
           this.getData();
       },
       computed: {
           paginatedTableData() {
               const start = (this.currentPage - 1) * this.pageSize;
               const end = start + this.pageSize;
               return this.tableData.slice(start, end);
           }
       },
       methods: {
           getData(){
               axios.post("http://127.0.0.1:10086/listEmp").then(res=>{
                 
                   this.tableData = res.data;
                   
                   console.log(this.tableData);
               })
           },
           onSubmit() {
               const name = this.userForm.name.toLowerCase();           
               this.tableData = this.sourceTable.filter(item => 
                   item.name.toLowerCase().includes(name)
               );
               this.currentPage = 1; // 重置页码
               
           },
           handlePageChange(newPage) {
               this.currentPage = newPage;
           },
           handleEdit(index, row) {
               console.log('编辑', index, row);
               // 在这里添加编辑逻辑
           },
           handleDelete(index, row) {
               console.log('删除', index, row);
               // 在这里添加删除逻辑
               this.tableData.splice(index, 1);
           }
       }
   }
   </script>
   <style>
   body{
       overflow: hidden; /* 隐藏滚动条 */
   
   }
   
   .full-screen {
       width: 100%;
       height: 100vh; /* 使用视口高度 */
       margin: 0;
       padding: 0;
   }
   </style>