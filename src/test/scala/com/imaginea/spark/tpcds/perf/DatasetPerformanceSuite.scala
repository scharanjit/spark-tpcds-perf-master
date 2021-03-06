package com.imaginea.spark.tpcds.perf

import org.apache.spark.sql.hive.test.TestHive
import org.scalatest.FunSuite

class DatasetPerformanceSuite extends FunSuite {
  test("run benchmark") {
    TestHive // Init HiveContext
    val benchmark = new DatasetPerformance() {
      override val numLongs = 100
    }
    import benchmark._

    val exp = runExperiment(allBenchmarks)
    exp.waitForFinish(10000)
  }
}
