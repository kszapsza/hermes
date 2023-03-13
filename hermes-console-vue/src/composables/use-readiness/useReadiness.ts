import { computed, ref } from 'vue';
import axios from 'axios';
import type { DatacenterReadiness } from '@/api/datacenter-readiness';

export function useReadiness() {
  const datacentersReadiness = ref<DatacenterReadiness[]>();
  const error = ref<boolean>(false);

  const loading = computed(() => !error.value && !datacentersReadiness.value);

  function fetchGroupNames() {
    axios
      .get<DatacenterReadiness[]>('/readiness/datacenters')
      .then((response) => (datacentersReadiness.value = response.data))
      .catch(() => (error.value = true));
  }

  fetchGroupNames();

  return {
    datacentersReadiness,
    loading,
    error,
  };
}
