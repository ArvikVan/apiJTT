package arv.apijtt.service;

import arv.apijtt.model.Clients;
import arv.apijtt.repo.ClientRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.05.2022
 */
@Service
public class ClientServiceImpl implements ClientsService {
    private final ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Clients createClient(Clients client) {
        return clientRepo.save(client);
    }

    @Override
    public List<Clients> getAllClients() {
        return clientRepo.findAll();
    }

    public Clients getById(Long id) {
        return clientRepo.findById(id).get();
    }

}
