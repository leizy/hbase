/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.http;

import org.apache.hadoop.hbase.classification.InterfaceAudience;
import org.apache.hadoop.hbase.classification.InterfaceStability;

/** 
 * This interface contains constants for configuration keys used
 * in the hbase http server code.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public interface ServerConfigurationKeys {

  /** Enable/Disable ssl for http server */
  public static final String HBASE_SSL_ENABLED_KEY = "hbase.ssl.enabled";

  public static final boolean HBASE_SSL_ENABLED_DEFAULT = false;

  /** Enable/Disable aliases serving from jetty */
  public static final String HBASE_JETTY_LOGS_SERVE_ALIASES =
      "hbase.jetty.logs.serve.aliases";

  public static final boolean DEFAULT_HBASE_JETTY_LOGS_SERVE_ALIASES =
      true;

  public static final String HBASE_HTTP_STATIC_USER = "hbase.http.staticuser.user";

  public static final String DEFAULT_HBASE_HTTP_STATIC_USER = "dr.stack";

}