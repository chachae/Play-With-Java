package com.chachae.design.structural.flyweight;

import cn.hutool.core.util.IdUtil;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 15:55
 */
public class MemoryFactory {

  private MemoryFactory() {
  }

  private static final List<Memory> memories = new CopyOnWriteArrayList<>();

  public static Memory getMemory(Long size) {
    Memory memory = null;
    for (int i = 0; i < memories.size(); i++) {
      memory = memories.get(i);
      if (memory.getSize().equals(size) && !memory.getUsed()) {
        memory.setUsed(true);
        memories.set(i, memory);
        break;
      } else {
        memory = null;
      }
    }

    if (memory == null) {
      memory = new Memory(IdUtil.fastUUID(), size, false);
      memories.add(memory);
    }
    return memory;
  }

  public static void release(String id) {
    for (int i = 0; i < memories.size(); i++) {
      Memory memory = memories.get(i);
      if (memory.getId().equals(id)) {
        memory.setUsed(false);
        memories.set(i, memory);
      }
    }
  }
}
