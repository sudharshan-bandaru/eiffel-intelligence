/*
Copyright 2021 Ericsson AB.
For a full list of individual contributors, please see the commit history.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.ericsson.ei.exception;

public class MongoDBConnectionException extends Exception {

        private static final long serialVersionUID = 2L;

        public MongoDBConnectionException() {
                super();
        }

        public MongoDBConnectionException(String message) {
                super(message);
        }

        public MongoDBConnectionException(String message, Throwable e) {
                super(message, e);
        }

}
