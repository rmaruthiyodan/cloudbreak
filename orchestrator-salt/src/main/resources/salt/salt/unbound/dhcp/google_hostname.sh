#!/bin/bash
# Copyright 2016 Google Inc. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

google_hostname_config() {
  hn=$(cat /etc/sysconfig/network | grep HOSTNAME=)
  if [[ -n "$hn" ]]; then
    new_host_name=${hn##*=} set_hostname
  else
    set_hostname
  fi
}

google_hostname_restore() {
  :
}