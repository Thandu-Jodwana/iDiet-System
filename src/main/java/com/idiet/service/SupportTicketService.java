public class SupportTicketService {
    private final SupportTicketRepository ticketRepo;

    public SupportTicketService(SupportTicketRepository ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public SupportTicket submitTicket(SupportTicket ticket) {
        ticket.setStatus("OPEN");
        return ticketRepo.save(ticket);
    }

    public void resolveTicket(String ticketId, String resolutionNote) {
        SupportTicket ticket = ticketRepo.findById(ticketId)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        ticket.setStatus("RESOLVED");
        ticket.setResolutionNote(resolutionNote);
        ticketRepo.save(ticket);
    }
}
