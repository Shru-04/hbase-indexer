/*
 * Copyright 2013 NGDATA nv
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ngdata.hbaseindexer;

public class SolrConnectionParams {
    /**
     * Solr connection mode: "cloud" or "classic".
     */
    public static final String MODE = "solr.mode";

    /**
     * If {@link #MODE} is cloud, this specifies the zookeeper to connect to (including a chroot like '/solr'
     * at the end of the ensemble, if necessary).
     */
    public static final String ZOOKEEPER = "solr.zk";

    /**
     * If {@link #MODE} is cloud, this specifies the name of the SolrCloud connection to send requests to.
     */
    public static final String COLLECTION = "solr.collection";

    /**
     * Solr home directory. Only applicable if {@link #MODE} is "classic".
     */
    public static final String SOLR_HOME_DIR = "solr.home";

    /**
     * Solr shard prefix
     */
    public static final String SOLR_SHARD_PREFIX = "solr.shard.";

    public static final String SHARDER_TYPE = "solr.sharder";
}
