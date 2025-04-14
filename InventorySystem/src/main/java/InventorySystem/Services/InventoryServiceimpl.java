package InventorySystem.Services;

import java.util.List;

import InventorySystem.DAO.InventoryDao;
import InventorySystem.Entities.Inventory;
import InventorySystem.Services.InventoryService;

public class InventoryServiceimpl implements InventoryService {
    private InventoryDao inventoryDao;

    public InventoryServiceimpl(InventoryDao inventoryDao) {
        this.inventoryDao = inventoryDao;
    }

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryDao.getAllInventory();
    }

    @Override
    public Inventory getInventoryById(long id) {
        return inventoryDao.getInventoryById(id);
    }

    @Override
    public Inventory createInventory(Inventory inventory) {
        inventoryDao.addInventory(inventory);
        return inventory;
    }

    @Override
    public Inventory updateInventory(long id, Inventory inventory) {
        inventory.setId(id);
        inventoryDao.updateInventory(inventory);
        return inventory;
    }

    @Override
    public void deleteinventory(long id) {
        inventoryDao.deleteInventory(id);
    }
}
