package com.imaginea.spark.tpcds

import org.apache.spark.sql.functions._

package object perf {
  val runtime =
    (col("result.analysisTime") + col("result.optimizationTime") + col("result.planningTime") + col("result.executionTime")).as("runtime")
}