<template>
    <div>
        <el-button @click="showmsg2">默认按钮</el-button>
        <el-button type="primary" @click="showMsg">主要按钮</el-button>
        <el-table :data="paginatedTableData" stripe style="width: 100%">
            <el-table-column prop="date" label="日期" width="180"></el-table-column>
            <el-table-column prop="name" label="姓名" width="180"></el-table-column>
            <el-table-column prop="address" label="地址"></el-table-column>
            <el-table-column prop="msg" label="消息"></el-table-column>
        </el-table>
        <div class="block">
            <el-pagination layout="prev, pager, next" :total="tableData.length" :page-size="pageSize"
                :current-page="currentPage" @current-change="handlePageChange"></el-pagination>
        </div>
    </div>
</template>

<script>
export default {
    name: 'ElementView',
    data() {
        return {
            tableData: [
                { date: '2016-05-02', name: '王小虎', address: '上海市普陀区金沙江路 1518 弄', msg: '112' },
                { date: '2016-05-04', name: '王小虎', address: '上海市普陀区金沙江路 1517 弄', msg: '1122' },
                { date: '2016-05-01', name: '王小虎', address: '上海市普陀区金沙江路 1519 弄', msg: '11222' },
                { date: '2016-05-03', name: '王小虎', address: '上海市普陀区金沙江路 1516 弄', msg: '1124' }
            ],
            currentPage: 1, // 当前页码
            pageSize: 2 // 每页显示的条目数
        }
    },
    computed: {
        paginatedTableData() {
            const start = (this.currentPage - 1) * this.pageSize;
            const end = start + this.pageSize;
            return this.tableData.slice(start, end);
        }
    },
    methods: {
        showMsg() {
            alert('主要按钮')
        },
        showmsg2() {
            alert('默认按钮')
        },
        handlePageChange(newPage) {
            this.currentPage = newPage;
        }
    }
}
</script>

<style scoped></style>