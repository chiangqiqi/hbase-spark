/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


name := "hive-spark"


scalaVersion := "2.11.7"

organization := "com.weidian"

version := "0.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.0" % "provided",
  "org.apache.spark" %% "spark-streaming" % "1.6.0" % "provided",
  "org.apache.spark" %% "spark-hive" % "1.6.0" % "provided",
  "org.apache.spark" %% "spark-streaming-kafka" % "1.6.0",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

libraryDependencies ++= Seq(
  "org.apache.hadoop" % "hadoop-core" % "1.2.1",
  "org.apache.hbase" % "hbase-client" % "1.1.2",
  "org.apache.hbase" % "hbase-common" % "1.1.2",
  "org.apache.hbase" % "hbase-server" % "1.1.2"
)
